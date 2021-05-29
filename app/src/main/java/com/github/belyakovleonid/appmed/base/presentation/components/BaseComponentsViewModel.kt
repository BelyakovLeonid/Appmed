package com.github.belyakovleonid.appmed.base.presentation.components

import androidx.annotation.CallSuper
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine

open class BaseComponentViewModel(
    protected val components: List<BaseComponent>,
    contentStrategy: ComponentStrategy<List<Any>, List<Any>> = CombineContentStrategy(),
) : ViewModel() {

    val content = contentStrategy.unionMethod(
        components.map {
            it.content.asStateFlow()
        }
    )

    init {
        components.forEach { component ->
            component.onAttach(this)
        }
    }

    suspend fun initComponents() {
        components.forEach { component ->
            component.onInitialize()
        }
        components.forEach { component ->
            component.onSubscribe()
        }
    }

    @CallSuper
    override fun onCleared() {
        components.forEach { component ->
            component.onCleared()
        }
        super.onCleared()
    }
}
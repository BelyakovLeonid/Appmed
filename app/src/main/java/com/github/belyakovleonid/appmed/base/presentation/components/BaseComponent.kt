package com.github.belyakovleonid.appmed.base.presentation.components

import androidx.annotation.CallSuper
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow

abstract class BaseComponent {

    protected lateinit var viewModelScope: CoroutineScope

    open val content = MutableStateFlow<List<Any>>(emptyList())

    open fun onAttach(viewModel: ViewModel) {
        viewModelScope = viewModel.viewModelScope
    }

    @CallSuper
    open fun onCleared() {
        content.tryEmit(emptyList())
    }

    open suspend fun onInitialize() {}

    open fun onSubscribe() {}

    protected suspend fun setContent(vararg items: Any) {
        content.emit(items.asList())
    }
}
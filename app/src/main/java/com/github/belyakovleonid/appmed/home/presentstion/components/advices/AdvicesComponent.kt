package com.github.belyakovleonid.appmed.home.presentstion.components.advices

import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponent
import com.github.belyakovleonid.appmed.home.domain.ProductsInteractor
import com.github.belyakovleonid.appmed.home.presentstion.components.advices.model.AlertAdvicesUiModel
import com.github.belyakovleonid.appmed.home.presentstion.components.advices.model.NormalAdvicesUiModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

class AdvicesComponent @Inject constructor(
    private val interactor: ProductsInteractor
) : BaseComponent() {

    override fun onSubscribe() {
        interactor.subscribeToSearchedProducts()
            .onEach { list ->
                val allergenProduct = list?.firstOrNull { it.allergens.isNotEmpty() }
                if (allergenProduct == null) {
                    setContent(NormalAdvicesUiModel())
                } else {
                    setContent(
                        AlertAdvicesUiModel(
                            medsName = allergenProduct.name,
                            alertComponentName = allergenProduct.allergens.first()
                        )
                    )
                }
            }
            .launchIn(viewModelScope)
    }
}
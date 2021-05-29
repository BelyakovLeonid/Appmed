package com.github.belyakovleonid.appmed.home.presentstion.components.advertisment

import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponent
import com.github.belyakovleonid.appmed.home.domain.ProductsInteractor
import com.github.belyakovleonid.appmed.home.presentstion.components.advertisment.model.AdvertisementsUiModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

class AdvertisementsComponent @Inject constructor(
    private val productsInteractor: ProductsInteractor
) : BaseComponent() {

    override fun onSubscribe() {
        productsInteractor.subscribeToSearchedProducts()
            .onEach { list ->
                if (list.isNullOrEmpty()) {
                    setContent(AdvertisementsUiModel())
                } else {
                    content.value = emptyList()
                }
            }
            .launchIn(viewModelScope)
    }
}
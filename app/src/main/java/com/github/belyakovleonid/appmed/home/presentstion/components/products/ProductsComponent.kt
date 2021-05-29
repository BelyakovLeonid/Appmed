package com.github.belyakovleonid.appmed.home.presentstion.components.products

import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponent
import com.github.belyakovleonid.appmed.home.domain.ProductsInteractor
import com.github.belyakovleonid.appmed.home.presentstion.components.products.model.ProductUiModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

class ProductsComponent @Inject constructor(
    private val productsInteractor: ProductsInteractor
) : BaseComponent() {

    override fun onSubscribe() {
        productsInteractor.subscribeToSearchedProducts()
            .onEach { list ->
                content.value = list?.map { products ->
                    ProductUiModel(
                        name = products.name,
                        description = products.description,
                        isAvailable = products.isAvailable,
                        isRecipe = products.isRecipe,
                        oldPrice = products.oldPrice,
                        newPrice = products.newPrice
                    )
                } ?: emptyList()
            }
            .launchIn(viewModelScope)
    }
}
package com.github.belyakovleonid.appmed.dose.presentation.components.product

import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponent
import com.github.belyakovleonid.appmed.dose.presentation.components.product.model.DoseProductUiModel
import com.github.belyakovleonid.appmed.home.domain.ProductsInteractor
import javax.inject.Inject

class ProductComponent @Inject constructor(
    private val interactor: ProductsInteractor
) : BaseComponent() {

    override suspend fun onInitialize() {
        val currentProduct = interactor.getCurrentProduct() ?: return
        setContent(
            DoseProductUiModel(
                name = currentProduct.name,
                isRecipe = currentProduct.isRecipe
            )
        )
    }
}
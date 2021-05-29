package com.github.belyakovleonid.appmed.home.presentstion.components.products

import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponent
import com.github.belyakovleonid.appmed.home.presentstion.components.products.model.ProductUiModel
import javax.inject.Inject

class ProductsComponent @Inject constructor(

) : BaseComponent() {

    override suspend fun onInitialize() {
        setContent(ProductUiModel())
    }
}
package com.github.belyakovleonid.appmed.home.presentstion.components.products

import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponent
import com.github.belyakovleonid.appmed.home.presentstion.components.advices.model.DoctorsNearbyUiModel
import com.github.belyakovleonid.appmed.home.presentstion.components.products.model.ProductUiModel

class ProductsComponent : BaseComponent() {

    override suspend fun onInitialize() {
        setContent(ProductUiModel())
    }
}
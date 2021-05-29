package com.github.belyakovleonid.appmed.home.presentstion.components.products.adapter

import com.github.belyakovleonid.appmed.R
import com.github.belyakovleonid.appmed.home.presentstion.components.advertisment.model.DrugByRecipeUiModel
import com.github.belyakovleonid.appmed.home.presentstion.components.products.model.ProductUiModel
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegate

fun productAD() = adapterDelegate<ProductUiModel, Any>(
    R.layout.product_item
) {}
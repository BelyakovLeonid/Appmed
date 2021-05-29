package com.github.belyakovleonid.appmed.home.presentstion.components.chip.adapter

import com.github.belyakovleonid.appmed.R
import com.github.belyakovleonid.appmed.home.presentstion.components.advertisment.model.DrugByRecipeUiModel
import com.github.belyakovleonid.appmed.home.presentstion.components.chip.model.ChipUiModel
import com.github.belyakovleonid.appmed.home.presentstion.components.dosage.model.DosageUiModel
import com.github.belyakovleonid.appmed.home.presentstion.components.products.model.ProductUiModel
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegate

fun chipsAD() = adapterDelegate<ChipUiModel, Any>(
    R.layout.chips_items
) {}
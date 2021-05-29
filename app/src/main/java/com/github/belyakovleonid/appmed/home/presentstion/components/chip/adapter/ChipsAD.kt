package com.github.belyakovleonid.appmed.home.presentstion.components.chip.adapter

import com.github.belyakovleonid.appmed.R
import com.github.belyakovleonid.appmed.home.presentstion.components.chip.model.ChipUiModel
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegate

fun chipsAD() = adapterDelegate<ChipUiModel, Any>(
    R.layout.chips_items
) {}
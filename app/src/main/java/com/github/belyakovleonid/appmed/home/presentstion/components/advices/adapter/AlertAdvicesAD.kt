package com.github.belyakovleonid.appmed.home.presentstion.components.advices.adapter

import com.github.belyakovleonid.appmed.R
import com.github.belyakovleonid.appmed.home.presentstion.components.advices.model.AlertAdvicesUiModel
import com.github.belyakovleonid.appmed.home.presentstion.components.advices.model.NormalAdvicesUiModel
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegate

fun alertAdvicesAD() = adapterDelegate<AlertAdvicesUiModel, Any>(
    R.layout.alert_advice_block_item
){}
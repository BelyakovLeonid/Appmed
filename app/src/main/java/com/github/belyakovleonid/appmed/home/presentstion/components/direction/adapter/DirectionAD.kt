package com.github.belyakovleonid.appmed.home.presentstion.components.direction.adapter

import com.github.belyakovleonid.appmed.R
import com.github.belyakovleonid.appmed.home.presentstion.components.direction.model.DirectionUiModel
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegate

fun directionAD() = adapterDelegate<DirectionUiModel, Any>(R.layout.direction_item) {}
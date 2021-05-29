package com.github.belyakovleonid.appmed.home.presentstion.components.advices.adapter

import com.github.belyakovleonid.appmed.R
import com.github.belyakovleonid.appmed.home.presentstion.components.advices.model.DoctorsNearbyUiModel
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegate

fun doctorsNearbyAD() = adapterDelegate<DoctorsNearbyUiModel, Any>(
    R.layout.doctors_nearby_item
){}
package com.github.belyakovleonid.appmed.home.presentstion.components.dosage.adapter

import com.github.belyakovleonid.appmed.R
import com.github.belyakovleonid.appmed.home.presentstion.components.dosage.model.DosageUiModel
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegate

fun dosageAD() = adapterDelegate<DosageUiModel, Any>(
    R.layout.dosage_item
) {}
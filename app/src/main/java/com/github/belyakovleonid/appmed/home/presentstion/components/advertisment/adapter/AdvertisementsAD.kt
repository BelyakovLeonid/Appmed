package com.github.belyakovleonid.appmed.home.presentstion.components.advertisment.adapter

import com.github.belyakovleonid.appmed.R
import com.github.belyakovleonid.appmed.home.presentstion.components.advertisment.model.AdvertisementsUiModel
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegate

fun advertisementsAD() = adapterDelegate<AdvertisementsUiModel, Any>(
    R.layout.advertisments_block_item
) {}
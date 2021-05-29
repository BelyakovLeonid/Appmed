package com.github.belyakovleonid.appmed.home.presentstion.components.search.adapter

import com.github.belyakovleonid.appmed.R
import com.github.belyakovleonid.appmed.home.presentstion.components.search.model.SearchUiModel
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegate

fun searchAD() = adapterDelegate<SearchUiModel, Any>(
    R.layout.search_item
){}
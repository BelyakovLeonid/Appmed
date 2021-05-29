package com.github.belyakovleonid.appmed.base.presentation.adapter

import com.github.belyakovleonid.appmed.R
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegate

fun emptyFallbackAD() = adapterDelegate<Any, Any>(
    R.layout.fallback_item
) { }
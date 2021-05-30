package com.github.belyakovleonid.appmed.dose.presentation.components.advice.adapter

import com.github.belyakovleonid.appmed.R
import com.github.belyakovleonid.appmed.dose.presentation.components.advice.model.DoseAdviceUiModel
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegate

fun doseAdviceAD() = adapterDelegate<DoseAdviceUiModel, Any>(
    R.layout.dose_recipe_advice_block
) {}
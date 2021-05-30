package com.github.belyakovleonid.appmed.dose.presentation.components.dose.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class DoseUiModel(
    @DrawableRes val imageResId: Int,
    @StringRes val title: Int,
    val text: String,
    val subText: String,
)
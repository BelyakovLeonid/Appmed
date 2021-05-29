package com.github.belyakovleonid.appmed.home.presentstion.components.products.model

import androidx.annotation.DrawableRes

data class ProductUiModel(
  val title: String,
  @DrawableRes val imageRes: Int,
  val description: String,
  val isAvailable: Boolean,
  val isRecipe: Boolean,
  val oldPrice: Int,
  val newPrice: Int,
  val rate: Float,
)
package com.github.belyakovleonid.appmed.home.presentstion.components.products.model

data class ProductUiModel(
  val name: String,
  val description: String,
  val isAvailable: Boolean,
  val isRecipe: Boolean,
  val oldPrice: Int,
  val newPrice: Int,
)
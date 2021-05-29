package com.github.belyakovleonid.appmed.home.domain.model

data class Product(
    val name: String,
    val dose: String,
    val description: String,
    val imageResId: Int,
    val isAvailable: Boolean,
    val isRecipe: Boolean,
    val oldPrice: Int,
    val newPrice: Int,
    val rate: Float,
    val defaultPortionMg: Int,
    val defaultCountPerDay: Int,
    val defaultCourseDays: Int,
    val allergens: List<String>
)
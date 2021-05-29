package com.github.belyakovleonid.appmed.home.data.remote.model

import com.github.belyakovleonid.appmed.home.domain.model.Product

data class ProductDto(
    val id: Long,
    val name: String,
    val dose: String,
    val imageResId: Int, // todo заменить на url
    val description: String,
    val isAvailable: Boolean,
    val isRecipe: Boolean,
    val oldPrice: Int,
    val newPrice: Int,
    val defaultPortionMg: Int,
    val defaultCountPerDay: Int,
    val defaultCourseDays: Int,
    val allergens: List<String>,
    val rate: Float
)

fun ProductDto.toDomain(): Product {
    return Product(
        name = name,
        dose = dose,
        description = description,
        imageResId = imageResId,
        isAvailable = isAvailable,
        isRecipe = isRecipe,
        oldPrice = oldPrice,
        newPrice = newPrice,
        allergens = allergens,
        rate = rate,
        defaultPortionMg = defaultPortionMg,
        defaultCountPerDay = defaultCountPerDay,
        defaultCourseDays = defaultCourseDays
    )
}
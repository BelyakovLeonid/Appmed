package com.github.belyakovleonid.appmed.home.data.remote.model

data class ProductDto(
    val id: Long,
    val name: String,
    val allergens: List<String>
)

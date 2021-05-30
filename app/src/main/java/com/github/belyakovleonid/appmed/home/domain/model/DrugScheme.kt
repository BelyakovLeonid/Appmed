package com.github.belyakovleonid.appmed.home.domain.model

data class DrugScheme(
    val name: String,
    val defaultPortionMg: Int,
    val defaultCountPerDay: Int,
    val defaultCourseDays: Int,
)

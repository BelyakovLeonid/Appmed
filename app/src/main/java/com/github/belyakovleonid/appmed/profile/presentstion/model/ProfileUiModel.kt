package com.github.belyakovleonid.appmed.profile.presentstion.model

data class ProfileUiModel(
    val name: String?,
    val showProductAlert: Boolean,
    val productName: String?,
    val productAllergen: String?,
    val age: String?,
    val sex: String?,
    val isPregnant: Boolean,
)

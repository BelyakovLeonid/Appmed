package com.github.belyakovleonid.appmed.profile.presentstion

import androidx.lifecycle.ViewModel
import com.github.belyakovleonid.appmed.home.domain.ProductsInteractor
import com.github.belyakovleonid.appmed.profile.presentstion.model.ProfileUiModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.filterNotNull
import javax.inject.Inject

class ProfileViewModel @Inject constructor(
    private val productsInteractor: ProductsInteractor
) : ViewModel() {

    private val _content = MutableStateFlow<ProfileUiModel?>(null)
    val content = _content.filterNotNull()

    init {
        val product = productsInteractor.getCurrentProduct()
        val productName = product?.name
        val productAllergen = product?.allergens?.firstOrNull()
        val showProductAlert = productName != null && productAllergen != null

        _content.value = ProfileUiModel(
            name = "",
            productName = productName,
            productAllergen = productAllergen,
            showProductAlert = showProductAlert,
            age = "",
            sex = "",
            isPregnant = false,
        )
    }
}
package com.github.belyakovleonid.appmed.profile.presentstion

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.github.belyakovleonid.appmed.home.domain.ProductsInteractor
import com.github.belyakovleonid.appmed.profile.domain.ProfileInteractor
import com.github.belyakovleonid.appmed.profile.domain.model.ProfileData
import com.github.belyakovleonid.appmed.profile.presentstion.model.ProfileUiModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.launch
import javax.inject.Inject

class ProfileViewModel @Inject constructor(
    private val productsInteractor: ProductsInteractor,
    private val profileInteractor: ProfileInteractor
) : ViewModel() {

    private val _content = MutableStateFlow<ProfileUiModel?>(null)
    val content = _content.filterNotNull()

    init {
        val profileData = profileInteractor.getCurrentProfileData()
        val product = productsInteractor.getCurrentProduct()
        val productName = product?.name
        val productAllergen = product?.allergens?.firstOrNull()
        val showProductAlert = productName != null && productAllergen != null


        _content.value = ProfileUiModel(
            name = profileData?.name,
            productName = productName,
            productAllergen = productAllergen,
            showProductAlert = showProductAlert,
            age = profileData?.age,
            sex = "", //todo переводить bool -> str
            isPregnant = profileData?.isPregnant ?: false,
        )
    }

    fun saveDataBeforeExit(data: ProfileData) {
        viewModelScope.launch {
            profileInteractor.saveProfileData(data)
        }
    }
}
package com.github.belyakovleonid.appmed.home.presentstion.components.dosage

import android.util.Log
import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponent
import com.github.belyakovleonid.appmed.home.domain.ProductsInteractor
import com.github.belyakovleonid.appmed.home.presentstion.components.dosage.model.DosageUiModel
import com.github.belyakovleonid.appmed.profile.domain.ProfileInteractor
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

class DosageComponent @Inject constructor(

    private val productsInteractor: ProductsInteractor,
    private val profileInteractor: ProfileInteractor,
) : BaseComponent() {

    override fun onSubscribe() {
        combine(
            productsInteractor.subscribeToSearchedProducts(),
            profileInteractor.subscribeToProfileData(),
            productsInteractor.subscribeToScheme()
        ) { products, profileData, scheme ->
            if (!products.isNullOrEmpty() && profileData == null) {
                scheme
            } else {
                null
            }
        }.onEach { scheme ->
            if (scheme != null) {
                setContent(
                    DosageUiModel(
                        mg = scheme.defaultPortionMg,
                        alertCount = scheme.defaultCountPerDay,
                        days = scheme.defaultCourseDays
                    )
                )
            } else {
                content.value = emptyList()
            }
        }.launchIn(viewModelScope)
    }
}
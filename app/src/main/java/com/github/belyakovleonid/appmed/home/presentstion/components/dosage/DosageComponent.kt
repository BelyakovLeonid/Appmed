package com.github.belyakovleonid.appmed.home.presentstion.components.dosage

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
        productsInteractor.subscribeToSearchedProducts()
            .combine(profileInteractor.subscribeToProfileData()) { products, profileData ->
                val firstProduct = products?.firstOrNull()
                if (profileData == null) firstProduct else null
            }.onEach { firstProduct ->
                if (firstProduct != null) {
                    setContent(
                        DosageUiModel(
                            mg = firstProduct.defaultPortionMg,
                            alertCount = firstProduct.defaultCountPerDay,
                            days = firstProduct.defaultCourseDays
                        )
                    )
                } else {
                    content.value = emptyList()
                }
            }.launchIn(viewModelScope)
    }
}
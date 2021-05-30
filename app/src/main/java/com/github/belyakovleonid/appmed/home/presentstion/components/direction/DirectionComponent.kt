package com.github.belyakovleonid.appmed.home.presentstion.components.direction

import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponent
import com.github.belyakovleonid.appmed.home.domain.ProductsInteractor
import com.github.belyakovleonid.appmed.home.presentstion.components.direction.model.DirectionUiModel
import com.github.belyakovleonid.appmed.profile.domain.ProfileInteractor
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

class DirectionComponent @Inject constructor(
    private val productsInteractor: ProductsInteractor,
    private val profileInteractor: ProfileInteractor,
) : BaseComponent() {

    override fun onSubscribe() {
        productsInteractor.subscribeToSearchedProducts()
            .combine(profileInteractor.subscribeToProfileData()) { products, profileData ->
                !products.isNullOrEmpty() && profileData != null
            }.onEach { shouldShow ->
                if (shouldShow) {
                    setContent(DirectionUiModel())
                } else {
                    content.value = emptyList()
                }
            }
            .launchIn(viewModelScope)
    }
}
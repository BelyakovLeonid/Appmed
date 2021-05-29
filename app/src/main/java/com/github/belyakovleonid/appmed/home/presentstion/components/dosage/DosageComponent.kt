package com.github.belyakovleonid.appmed.home.presentstion.components.dosage

import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponent
import com.github.belyakovleonid.appmed.home.domain.ProductsInteractor
import com.github.belyakovleonid.appmed.home.presentstion.components.dosage.model.DosageUiModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

class DosageComponent @Inject constructor(
    private val productsInteractor: ProductsInteractor,
) : BaseComponent() {

    override fun onSubscribe() {
        productsInteractor.subscribeToSearchedProducts()
            .onEach { list ->
                val firstProduct = list?.firstOrNull()
                if (firstProduct == null) {
                    content.value = emptyList()
                } else {
                    setContent(
                        DosageUiModel(
                            mg = firstProduct.defaultPortionMg,
                            alertCount = firstProduct.defaultCountPerDay,
                            days = firstProduct.defaultCourseDays
                        )
                    )
                }
            }
            .launchIn(viewModelScope)
    }
}
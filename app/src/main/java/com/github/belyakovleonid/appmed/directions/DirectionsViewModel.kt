package com.github.belyakovleonid.appmed.directions

import androidx.lifecycle.viewModelScope
import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponentViewModel
import com.github.belyakovleonid.appmed.dose.presentation.components.advice.DoseAdviceComponent
import com.github.belyakovleonid.appmed.dose.presentation.components.controls.ControlsComponent
import com.github.belyakovleonid.appmed.dose.presentation.components.dose.DoseComponent
import com.github.belyakovleonid.appmed.dose.presentation.components.product.DoseProductComponent
import com.github.belyakovleonid.appmed.dose.presentation.components.profile.DoseProfileComponent
import com.github.belyakovleonid.appmed.home.domain.ProductsInteractor
import com.github.belyakovleonid.appmed.profile.domain.ProfileInteractor
import kotlinx.coroutines.launch
import javax.inject.Inject

class DirectionsViewModel @Inject constructor(
    private val productsInteractor: ProductsInteractor,
    private val profileInteractor: ProfileInteractor,
    profileComponent: DoseProfileComponent,
    productComponent: DoseProductComponent,
    doseAdviceComponent: DoseAdviceComponent,
    doseComponent: DoseComponent,
    controlsComponent: ControlsComponent,
) : BaseComponentViewModel(
    listOf(
        profileComponent,
        productComponent,
        doseAdviceComponent,
        doseComponent,
        controlsComponent
    )
) {
    init {
        viewModelScope.launch {
            initDummyData()
            initComponents()
        }
    }

    private fun initDummyData() {
        productsInteractor.setDummyData()
        profileInteractor.setDummyData()
    }

    override fun onCleared() {
        super.onCleared()
        removeDummyData()
    }

    fun removeDummyData() {
        productsInteractor.removeDummyData()
        profileInteractor.removeDummyData()
    }
}
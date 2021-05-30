package com.github.belyakovleonid.appmed.dose.presentation

import androidx.lifecycle.viewModelScope
import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponentViewModel
import com.github.belyakovleonid.appmed.dose.presentation.components.advice.DoseAdviceComponent
import com.github.belyakovleonid.appmed.dose.presentation.components.controls.ControlsComponent
import com.github.belyakovleonid.appmed.dose.presentation.components.dose.DoseComponent
import com.github.belyakovleonid.appmed.dose.presentation.components.product.DoseProductComponent
import com.github.belyakovleonid.appmed.dose.presentation.components.profile.DoseProfileComponent
import kotlinx.coroutines.launch
import javax.inject.Inject

class DoseViewModel @Inject constructor(
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
            initComponents()
        }
    }

}
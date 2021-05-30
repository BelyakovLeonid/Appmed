package com.github.belyakovleonid.appmed.dose.presentation

import androidx.lifecycle.viewModelScope
import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponentViewModel
import com.github.belyakovleonid.appmed.dose.presentation.components.product.ProductComponent
import com.github.belyakovleonid.appmed.dose.presentation.components.profile.ProfileComponent
import kotlinx.coroutines.launch
import javax.inject.Inject

class DoseViewModel @Inject constructor(
    profileComponent: ProfileComponent,
    productComponent: ProductComponent,
) : BaseComponentViewModel(
    listOf(
        profileComponent,
        productComponent
    )
) {
    init {
        viewModelScope.launch {
            initComponents()
        }
    }

}
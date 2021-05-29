package com.github.belyakovleonid.appmed.home.presentstion

import androidx.lifecycle.viewModelScope
import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponentViewModel
import com.github.belyakovleonid.appmed.home.presentstion.components.advertisment.AdvertisementsComponent
import com.github.belyakovleonid.appmed.home.presentstion.components.advices.AdvicesComponent
import com.github.belyakovleonid.appmed.home.presentstion.components.chip.ChipComponent
import com.github.belyakovleonid.appmed.home.presentstion.components.dosage.DosageComponent
import com.github.belyakovleonid.appmed.home.presentstion.components.products.ProductsComponent
import com.github.belyakovleonid.appmed.home.presentstion.components.search.SearchComponent
import kotlinx.coroutines.launch

class HomeViewModel(

) : BaseComponentViewModel(
    components = listOf(
        AdvicesComponent(),
        SearchComponent(),
        AdvertisementsComponent(),
        ChipComponent(),
        DosageComponent(),
        ProductsComponent()
    )
) {

    init {
        viewModelScope.launch {
            initComponents()
        }
    }
}
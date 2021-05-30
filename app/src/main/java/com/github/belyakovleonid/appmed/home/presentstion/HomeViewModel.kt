package com.github.belyakovleonid.appmed.home.presentstion

import androidx.lifecycle.viewModelScope
import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponentViewModel
import com.github.belyakovleonid.appmed.home.domain.ProductsInteractor
import com.github.belyakovleonid.appmed.home.domain.model.Product
import com.github.belyakovleonid.appmed.home.presentstion.components.advertisment.AdvertisementsComponent
import com.github.belyakovleonid.appmed.home.presentstion.components.advices.AdvicesComponent
import com.github.belyakovleonid.appmed.home.presentstion.components.direction.DirectionComponent
import com.github.belyakovleonid.appmed.home.presentstion.components.dosage.DosageComponent
import com.github.belyakovleonid.appmed.home.presentstion.components.products.ProductsComponent
import com.github.belyakovleonid.appmed.home.presentstion.components.search.ISearchComponent
import com.github.belyakovleonid.appmed.home.presentstion.components.search.SearchComponent
import kotlinx.coroutines.launch
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    private val productsInteractor: ProductsInteractor,
    advicesComponent: AdvicesComponent,
    searchComponent: SearchComponent,
    advertisementsComponent: AdvertisementsComponent,
    dosageComponent: DosageComponent,
    directionComponent: DirectionComponent,
    productsComponent: ProductsComponent,
) : BaseComponentViewModel(
    components = listOf(
        advicesComponent,
        searchComponent,
        advertisementsComponent,
        dosageComponent,
        directionComponent,
        productsComponent
    )
), ISearchComponent by searchComponent {

    init {
        viewModelScope.launch {
            initComponents()
        }
    }
}
package com.github.belyakovleonid.appmed.home.presentstion.components.search

import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponent
import com.github.belyakovleonid.appmed.home.domain.ProductsInteractor
import com.github.belyakovleonid.appmed.home.presentstion.components.search.model.SearchUiModel
import javax.inject.Inject

class SearchComponent @Inject constructor(
    private val productsInteractor: ProductsInteractor
) : BaseComponent(), ISearchComponent {

    override suspend fun onInitialize() {
        setContent(SearchUiModel())
    }

    override fun onSearchQuery(query: String) {
        productsInteractor.setSearchQuery(query)
    }
}
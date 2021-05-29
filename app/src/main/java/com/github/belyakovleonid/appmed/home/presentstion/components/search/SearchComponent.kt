package com.github.belyakovleonid.appmed.home.presentstion.components.search

import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponent
import com.github.belyakovleonid.appmed.home.presentstion.components.search.model.SearchUiModel

class SearchComponent : BaseComponent() {

    override suspend fun onInitialize() {
        setContent(SearchUiModel())
    }
}
package com.github.belyakovleonid.appmed.home.presentstion.components.advices

import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponent
import com.github.belyakovleonid.appmed.home.presentstion.components.advices.model.NormalAdvicesUiModel
import javax.inject.Inject

class AdvicesComponent @Inject constructor(

) : BaseComponent() {

    override suspend fun onInitialize() {
        setContent(NormalAdvicesUiModel())
    }
}
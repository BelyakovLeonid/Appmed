package com.github.belyakovleonid.appmed.home.presentstion.components.chip

import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponent
import com.github.belyakovleonid.appmed.home.presentstion.components.chip.model.ChipUiModel
import javax.inject.Inject

class ChipComponent @Inject constructor(

) : BaseComponent() {

    override suspend fun onInitialize() {
        setContent(ChipUiModel())
    }
}
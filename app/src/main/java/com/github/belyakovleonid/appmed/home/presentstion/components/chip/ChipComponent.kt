package com.github.belyakovleonid.appmed.home.presentstion.components.chip

import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponent
import com.github.belyakovleonid.appmed.home.presentstion.components.advices.model.DoctorsNearbyUiModel
import com.github.belyakovleonid.appmed.home.presentstion.components.chip.model.ChipUiModel

class ChipComponent : BaseComponent() {

    override suspend fun onInitialize() {
        setContent(ChipUiModel())
    }
}
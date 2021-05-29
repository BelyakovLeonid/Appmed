package com.github.belyakovleonid.appmed.home.presentstion.components.dosage

import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponent
import com.github.belyakovleonid.appmed.home.presentstion.components.advices.model.DoctorsNearbyUiModel

class DosageComponent : BaseComponent() {

    override suspend fun onInitialize() {
        setContent(DoctorsNearbyUiModel())
    }
}
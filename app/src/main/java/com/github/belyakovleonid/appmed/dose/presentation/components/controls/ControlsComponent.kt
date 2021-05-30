package com.github.belyakovleonid.appmed.dose.presentation.components.controls

import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponent
import com.github.belyakovleonid.appmed.dose.presentation.components.controls.model.ControlsUiModel
import javax.inject.Inject

class ControlsComponent @Inject constructor() : BaseComponent() {

    override suspend fun onInitialize() {
        setContent(ControlsUiModel())
    }
}
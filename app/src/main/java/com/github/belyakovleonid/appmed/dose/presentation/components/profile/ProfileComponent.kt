package com.github.belyakovleonid.appmed.dose.presentation.components.profile

import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponent
import com.github.belyakovleonid.appmed.dose.presentation.components.profile.model.EmptyProfileUiModel
import javax.inject.Inject

class ProfileComponent @Inject constructor() : BaseComponent() {

    override suspend fun onInitialize() {
        setContent(EmptyProfileUiModel())
    }
}
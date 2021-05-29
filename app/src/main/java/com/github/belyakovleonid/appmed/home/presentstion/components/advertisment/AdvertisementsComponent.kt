package com.github.belyakovleonid.appmed.home.presentstion.components.advertisment

import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponent
import com.github.belyakovleonid.appmed.home.presentstion.components.advertisment.model.AdvertisementsUiModel
import javax.inject.Inject

class AdvertisementsComponent @Inject constructor(

) : BaseComponent() {

    override suspend fun onInitialize() {
        setContent(AdvertisementsUiModel())
    }
}
package com.github.belyakovleonid.appmed.home.presentstion.components.advertisment

import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponent
import com.github.belyakovleonid.appmed.home.presentstion.components.advertisment.model.DrugByRecipeUiModel
import com.github.belyakovleonid.appmed.home.presentstion.components.advices.model.DoctorsNearbyUiModel
import javax.inject.Inject

class AdvertisementsComponent @Inject constructor(

) : BaseComponent() {

    override suspend fun onInitialize() {
        setContent(DrugByRecipeUiModel())
    }
}
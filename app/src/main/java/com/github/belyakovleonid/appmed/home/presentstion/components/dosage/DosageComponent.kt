package com.github.belyakovleonid.appmed.home.presentstion.components.dosage

import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponent
import com.github.belyakovleonid.appmed.home.presentstion.components.advices.model.NormalAdvicesUiModel
import com.github.belyakovleonid.appmed.home.presentstion.components.dosage.model.DosageUiModel
import javax.inject.Inject

class DosageComponent @Inject constructor(

) : BaseComponent() {

    override suspend fun onInitialize() {
        setContent(DosageUiModel(3,2,5))
    }
}
package com.github.belyakovleonid.appmed.dose.presentation.components.advice

import android.util.Log
import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponent
import com.github.belyakovleonid.appmed.dose.presentation.components.advice.model.DoseAdviceUiModel
import com.github.belyakovleonid.appmed.home.domain.ProductsInteractor
import javax.inject.Inject

class DoseAdviceComponent @Inject constructor(
    private val interactor: ProductsInteractor
) : BaseComponent() {

    override suspend fun onInitialize() {
        val isRecipeProduct = interactor.getCurrentProduct()?.isRecipe ?: false
        if (isRecipeProduct) {
            setContent(DoseAdviceUiModel())
        }
    }
}
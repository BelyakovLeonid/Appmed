package com.github.belyakovleonid.appmed.dose.presentation.components.product.adapter

import androidx.core.view.isVisible
import com.github.belyakovleonid.appmed.databinding.DoseProductItemBinding
import com.github.belyakovleonid.appmed.dose.presentation.components.product.model.DoseProductUiModel
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding

fun doseProductAD() = adapterDelegateViewBinding<DoseProductUiModel, Any, DoseProductItemBinding>(
    { layoutInflater, root -> DoseProductItemBinding.inflate(layoutInflater, root, false) }
) {

    bind {
        with(binding) {
            name.text = item.name
            isRecipe.isVisible = item.isRecipe
        }
    }
}
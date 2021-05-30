package com.github.belyakovleonid.appmed.dose.presentation.components.advice.adapter

import com.github.belyakovleonid.appmed.databinding.DoseRecipeAdviceBlockBinding
import com.github.belyakovleonid.appmed.dose.presentation.components.advice.model.DoseAdviceUiModel
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding

fun doseAdviceAD(
    onInfoClick: () -> Unit
) = adapterDelegateViewBinding<DoseAdviceUiModel, Any, DoseRecipeAdviceBlockBinding>(
    { layoutInflater, root -> DoseRecipeAdviceBlockBinding.inflate(layoutInflater, root, false) }
) {
    binding.doctorsItem.setOnClickListener {
        onInfoClick.invoke()
    }
}
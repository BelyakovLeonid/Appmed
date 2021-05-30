package com.github.belyakovleonid.appmed.dose.presentation.components.controls.adapter

import com.github.belyakovleonid.appmed.databinding.DoseControlsSaveItemBinding
import com.github.belyakovleonid.appmed.dose.presentation.components.controls.model.ControlsSaveUiModel
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding

fun controlsSaveAD(
    onButtonCLick: () -> Unit
) = adapterDelegateViewBinding<ControlsSaveUiModel, Any, DoseControlsSaveItemBinding>(
    { layoutInflater, root -> DoseControlsSaveItemBinding.inflate(layoutInflater, root, false) }
) {

    binding.button.setOnClickListener {
        onButtonCLick.invoke()
    }
}
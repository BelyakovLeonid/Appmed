package com.github.belyakovleonid.appmed.dose.presentation.components.controls.adapter

import com.github.belyakovleonid.appmed.databinding.DoseControlsItemBinding
import com.github.belyakovleonid.appmed.databinding.DoseItemBinding
import com.github.belyakovleonid.appmed.dose.presentation.components.controls.model.ControlsUiModel
import com.github.belyakovleonid.appmed.dose.presentation.components.dose.model.DoseUiModel
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding

fun controlsAD(
    onButtonCLick: ()-> Unit
) = adapterDelegateViewBinding<ControlsUiModel, Any, DoseControlsItemBinding>(
    { layoutInflater, root -> DoseControlsItemBinding.inflate(layoutInflater, root, false) }
) {

    binding.button.setOnClickListener {

    }
}
package com.github.belyakovleonid.appmed.dose.presentation.components.controls.adapter

import android.transition.TransitionManager
import androidx.core.view.isVisible
import com.github.belyakovleonid.appmed.databinding.DoseControlsItemBinding
import com.github.belyakovleonid.appmed.dose.presentation.components.controls.model.ControlsUiModel
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding

fun controlsAD(
    onButtonCLick: () -> Unit
) = adapterDelegateViewBinding<ControlsUiModel, Any, DoseControlsItemBinding>(
    { layoutInflater, root -> DoseControlsItemBinding.inflate(layoutInflater, root, false) }
) {

    binding.button.setOnClickListener {
        onButtonCLick.invoke()
    }

    binding.reminderSwitch.setOnCheckedChangeListener { buttonView, isChecked ->
        TransitionManager.beginDelayedTransition(binding.root)
        binding.stub.isVisible = isChecked
    }
}
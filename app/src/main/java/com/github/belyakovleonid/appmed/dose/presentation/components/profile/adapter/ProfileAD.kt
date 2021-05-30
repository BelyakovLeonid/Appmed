package com.github.belyakovleonid.appmed.dose.presentation.components.profile.adapter

import com.github.belyakovleonid.appmed.databinding.ProfileItemBinding
import com.github.belyakovleonid.appmed.dose.presentation.components.profile.model.DoseProfileUiModel
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding

fun profileAD(
    onAddProfileClick: () -> Unit
) = adapterDelegateViewBinding<DoseProfileUiModel, Any, ProfileItemBinding>(
    { layoutInflater, root -> ProfileItemBinding.inflate(layoutInflater, root, false) }
) {

    bind {
        binding.text.text = item.profileName
    }
}
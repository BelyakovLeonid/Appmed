package com.github.belyakovleonid.appmed.dose.presentation.components.profile.adapter

import com.github.belyakovleonid.appmed.databinding.EmptyProfileItemBinding
import com.github.belyakovleonid.appmed.dose.presentation.components.profile.model.EmptyProfileUiModel
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding

fun emptyProfileAD(
    onAddProfileClick: () -> Unit
) = adapterDelegateViewBinding<EmptyProfileUiModel, Any, EmptyProfileItemBinding>(
    { layoutInflater, root -> EmptyProfileItemBinding.inflate(layoutInflater, root, false) }
) {

    binding.addButton.setOnClickListener {
        onAddProfileClick.invoke()
    }
}
package com.github.belyakovleonid.appmed.home.presentstion.components.advices.adapter

import com.github.belyakovleonid.appmed.databinding.NormalAdviceBlockItemBinding
import com.github.belyakovleonid.appmed.home.presentstion.components.advices.model.NormalAdvicesUiModel
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding

fun normalAdvicesAD(
    onDirectionsClick: () -> Unit
) = adapterDelegateViewBinding<NormalAdvicesUiModel, Any, NormalAdviceBlockItemBinding>(
    { layoutInflater, root -> NormalAdviceBlockItemBinding.inflate(layoutInflater, root, false) }
) {

    binding.personalItem.setOnClickListener {
        onDirectionsClick.invoke()
    }
}
package com.github.belyakovleonid.appmed.dose.presentation.components.dose.adapter

import com.github.belyakovleonid.appmed.databinding.DoseItemBinding
import com.github.belyakovleonid.appmed.dose.presentation.components.dose.model.DoseUiModel
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding

fun doseAD() = adapterDelegateViewBinding<DoseUiModel, Any, DoseItemBinding>(
    { layoutInflater, root -> DoseItemBinding.inflate(layoutInflater, root, false) }
) {

    bind {
        with(binding) {
            name.setText(item.title)
            doseText.text = item.text
            doseSubtitle.text = item.subText
            doseIcon.setImageResource(item.imageResId)
        }
    }
}
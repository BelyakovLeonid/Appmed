package com.github.belyakovleonid.appmed.home.presentstion.components.dosage.adapter

import com.github.belyakovleonid.appmed.R
import com.github.belyakovleonid.appmed.databinding.DosageItemBinding
import com.github.belyakovleonid.appmed.home.presentstion.components.dosage.model.DosageUiModel
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding

fun dosageAD(
    onDoseClick: () -> Unit
) = adapterDelegateViewBinding<DosageUiModel, Any, DosageItemBinding>(
    { layoutInflater, root -> DosageItemBinding.inflate(layoutInflater, root, false) }
) {

    itemView.setOnClickListener {
        onDoseClick.invoke()
    }
    binding.buttonDoze.setOnClickListener {
        onDoseClick.invoke()
    }

    bind {
        with(binding) {
            textMg.text = itemView.resources.getString(R.string.dose_mg, item.mg)
            textAlert.text = itemView.resources.getQuantityString(
                R.plurals.dose_count, item.alertCount, item.alertCount
            )
            textDays.text = itemView.resources.getQuantityString(
                R.plurals.dose_days, item.days, item.days
            )
        }
    }
}
package com.github.belyakovleonid.appmed.home.presentstion.components.advices.adapter

import com.github.belyakovleonid.appmed.R
import com.github.belyakovleonid.appmed.databinding.AlertAdviceBlockItemBinding
import com.github.belyakovleonid.appmed.home.presentstion.components.advices.model.AlertAdvicesUiModel
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding

fun alertAdvicesAD(
    onInfoClick: () -> Unit,
) = adapterDelegateViewBinding<AlertAdvicesUiModel, Any, AlertAdviceBlockItemBinding>(
    { layoutInflater, root -> AlertAdviceBlockItemBinding.inflate(layoutInflater, root, false) }
) {

    binding.doctorsItem.setOnClickListener {
        onInfoClick.invoke()
    }

    bind {
        binding.alertTitle.text = itemView.resources.getString(R.string.alert_title, item.alertComponentName)
        binding.doctorsTitle.text = itemView.resources.getString(
            R.string.alert_drug_title,
            item.medsName,
            item.alertComponentName
        )
    }
}
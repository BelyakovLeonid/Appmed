package com.github.belyakovleonid.appmed.dose.presentation.adapter

import androidx.recyclerview.widget.DiffUtil
import com.github.belyakovleonid.appmed.base.presentation.adapter.emptyFallbackAD
import com.github.belyakovleonid.appmed.dose.presentation.components.advice.adapter.doseAdviceAD
import com.github.belyakovleonid.appmed.dose.presentation.components.advice.model.DoseAdviceUiModel
import com.github.belyakovleonid.appmed.dose.presentation.components.controls.adapter.controlsAD
import com.github.belyakovleonid.appmed.dose.presentation.components.controls.model.ControlsUiModel
import com.github.belyakovleonid.appmed.dose.presentation.components.dose.adapter.doseAD
import com.github.belyakovleonid.appmed.dose.presentation.components.product.adapter.doseProductAD
import com.github.belyakovleonid.appmed.dose.presentation.components.profile.adapter.emptyProfileAD
import com.github.belyakovleonid.appmed.dose.presentation.components.profile.adapter.profileAD
import com.github.belyakovleonid.appmed.dose.presentation.components.profile.model.EmptyProfileUiModel
import com.hannesdorfmann.adapterdelegates4.AsyncListDifferDelegationAdapter
import kotlin.jvm.internal.Intrinsics

class DoseAdapter(
    onAddProfileClick: () -> Unit,
    onSaveClick: () -> Unit
) : AsyncListDifferDelegationAdapter<Any>(DiffCallback) {

    init {
        delegatesManager
            .setFallbackDelegate(emptyFallbackAD())
            .addDelegate(emptyProfileAD(onAddProfileClick))
            .addDelegate(profileAD(onAddProfileClick))
            .addDelegate(profileAD(onAddProfileClick))
            .addDelegate(doseProductAD())
            .addDelegate(doseAD())
            .addDelegate(doseAdviceAD())
            .addDelegate(controlsAD(onSaveClick))
    }

    private companion object DiffCallback : DiffUtil.ItemCallback<Any>() {

        override fun areItemsTheSame(oldItem: Any, newItem: Any): Boolean {
            return oldItem.javaClass == newItem.javaClass
        }

        //todo change
        override fun areContentsTheSame(oldItem: Any, newItem: Any): Boolean {
            return when {
                oldItem is EmptyProfileUiModel && newItem is EmptyProfileUiModel -> true
                oldItem is DoseAdviceUiModel && newItem is DoseAdviceUiModel -> true
                oldItem is ControlsUiModel && newItem is ControlsUiModel -> true
                else -> Intrinsics.areEqual(oldItem, newItem)
            }
        }
    }
}
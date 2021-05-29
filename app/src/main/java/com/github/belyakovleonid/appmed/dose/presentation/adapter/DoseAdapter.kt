package com.github.belyakovleonid.appmed.dose.presentation.adapter

import androidx.recyclerview.widget.DiffUtil
import com.github.belyakovleonid.appmed.base.presentation.adapter.emptyFallbackAD
import com.github.belyakovleonid.appmed.dose.presentation.components.product.adapter.doseProductAD
import com.github.belyakovleonid.appmed.dose.presentation.components.profile.adapter.emptyProfileAD
import com.github.belyakovleonid.appmed.dose.presentation.components.profile.adapter.profileAD
import com.github.belyakovleonid.appmed.home.presentstion.components.advertisment.model.AdvertisementsUiModel
import com.github.belyakovleonid.appmed.home.presentstion.components.advices.model.NormalAdvicesUiModel
import com.github.belyakovleonid.appmed.home.presentstion.components.search.model.SearchUiModel
import com.hannesdorfmann.adapterdelegates4.AsyncListDifferDelegationAdapter
import kotlin.jvm.internal.Intrinsics

class DoseAdapter(
    onAddProfileClick: () -> Unit
) : AsyncListDifferDelegationAdapter<Any>(DiffCallback) {

    init {
        delegatesManager
            .setFallbackDelegate(emptyFallbackAD())
            .addDelegate(emptyProfileAD(onAddProfileClick))
            .addDelegate(profileAD(onAddProfileClick))
            .addDelegate(profileAD(onAddProfileClick))
            .addDelegate(doseProductAD())
    }

    private companion object DiffCallback : DiffUtil.ItemCallback<Any>() {

        override fun areItemsTheSame(oldItem: Any, newItem: Any): Boolean {
            return oldItem.javaClass == newItem.javaClass
        }

        //todo change
        override fun areContentsTheSame(oldItem: Any, newItem: Any): Boolean {
            return when {
                oldItem is AdvertisementsUiModel && newItem is AdvertisementsUiModel -> true
                oldItem is NormalAdvicesUiModel && newItem is NormalAdvicesUiModel -> true
                oldItem is SearchUiModel && newItem is SearchUiModel -> true
                else -> Intrinsics.areEqual(oldItem, newItem)
            }
        }
    }
}
package com.github.belyakovleonid.appmed.home.presentstion.adapter

import androidx.recyclerview.widget.DiffUtil
import com.github.belyakovleonid.appmed.base.presentation.adapter.emptyFallbackAD
import com.github.belyakovleonid.appmed.home.presentstion.components.advertisment.adapter.advertisementsAD
import com.github.belyakovleonid.appmed.home.presentstion.components.advertisment.model.AdvertisementsUiModel
import com.github.belyakovleonid.appmed.home.presentstion.components.advices.adapter.alertAdvicesAD
import com.github.belyakovleonid.appmed.home.presentstion.components.advices.adapter.normalAdvicesAD
import com.github.belyakovleonid.appmed.home.presentstion.components.advices.model.NormalAdvicesUiModel
import com.github.belyakovleonid.appmed.home.presentstion.components.direction.adapter.directionAD
import com.github.belyakovleonid.appmed.home.presentstion.components.direction.model.DirectionUiModel
import com.github.belyakovleonid.appmed.home.presentstion.components.dosage.adapter.dosageAD
import com.github.belyakovleonid.appmed.home.presentstion.components.products.adapter.productAD
import com.github.belyakovleonid.appmed.home.presentstion.components.search.adapter.searchAD
import com.github.belyakovleonid.appmed.home.presentstion.components.search.model.SearchUiModel
import com.hannesdorfmann.adapterdelegates4.AsyncListDifferDelegationAdapter
import kotlin.jvm.internal.Intrinsics

class HomeAdapter(
    onSearchQuery: (String) -> Unit,
    onDirectionsClick: () -> Unit,
    onInfoClick: () -> Unit,
    onDoseClick: () -> Unit
) : AsyncListDifferDelegationAdapter<Any>(DiffCallback) {

    init {
        delegatesManager
            .setFallbackDelegate(emptyFallbackAD())
            .addDelegate(normalAdvicesAD(onDirectionsClick))
            .addDelegate(alertAdvicesAD(onInfoClick))
            .addDelegate(searchAD(onSearchQuery))
            .addDelegate(advertisementsAD())
            .addDelegate(dosageAD(onDoseClick))
            .addDelegate(productAD())
            .addDelegate(directionAD())
    }

    private companion object DiffCallback : DiffUtil.ItemCallback<Any>() {

        override fun areItemsTheSame(oldItem: Any, newItem: Any): Boolean {
            return oldItem.javaClass == newItem.javaClass
        }

        override fun areContentsTheSame(oldItem: Any, newItem: Any): Boolean {
            return when {
                oldItem is AdvertisementsUiModel && newItem is AdvertisementsUiModel -> true
                oldItem is NormalAdvicesUiModel && newItem is NormalAdvicesUiModel -> true
                oldItem is SearchUiModel && newItem is SearchUiModel -> true
                oldItem is DirectionUiModel && newItem is DirectionUiModel -> true
                else -> Intrinsics.areEqual(oldItem, newItem)
            }
        }
    }
}
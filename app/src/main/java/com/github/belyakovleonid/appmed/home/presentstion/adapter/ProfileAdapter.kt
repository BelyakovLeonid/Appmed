package com.github.belyakovleonid.appmed.home.presentstion.adapter

import androidx.recyclerview.widget.DiffUtil
import com.github.belyakovleonid.appmed.base.presentation.adapter.emptyFallbackAD
import com.github.belyakovleonid.appmed.home.presentstion.components.advices.adapter.alertAdvicesAD
import com.github.belyakovleonid.appmed.home.presentstion.components.advices.adapter.normalAdvicesAD
import com.github.belyakovleonid.appmed.home.presentstion.components.search.adapter.searchAD
import com.hannesdorfmann.adapterdelegates4.AsyncListDifferDelegationAdapter
import kotlin.jvm.internal.Intrinsics

class ProfileAdapter(
//    onButtonClick: () -> Unit,
//    onRetryClick: () -> Unit,
) : AsyncListDifferDelegationAdapter<Any>(DiffCallback) {

    init {
        delegatesManager
            .setFallbackDelegate(emptyFallbackAD())
            .addDelegate(normalAdvicesAD())
            .addDelegate(alertAdvicesAD())
            .addDelegate(searchAD())
//            .addDelegate(targetImageAD())
//            .addDelegate(targetTextAD(onTextControlClick))
//            .addDelegate(targetDatesAD())
//            .addDelegate(targetHintsAD())
//            .addDelegate(targetStepsAD())
//            .addDelegate(targetBrandAD(onBrandClick))
//            .addDelegate(targetButtonAD(onButtonClick))
//            .addDelegate(targetProgressBarAD())
    }

    private companion object DiffCallback : DiffUtil.ItemCallback<Any>() {

        override fun areItemsTheSame(oldItem: Any, newItem: Any): Boolean {
            return oldItem.javaClass == newItem.javaClass
        }

        override fun areContentsTheSame(oldItem: Any, newItem: Any): Boolean {
            return Intrinsics.areEqual(oldItem, newItem)
        }
    }
}
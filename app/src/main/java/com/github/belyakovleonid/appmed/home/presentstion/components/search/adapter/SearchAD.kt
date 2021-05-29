package com.github.belyakovleonid.appmed.home.presentstion.components.search.adapter

import android.view.inputmethod.EditorInfo
import android.widget.TextView
import com.github.belyakovleonid.appmed.databinding.SearchItemBinding
import com.github.belyakovleonid.appmed.home.presentstion.components.search.model.SearchUiModel
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding

fun searchAD(
    onSearchQuery: (String) -> Unit
) = adapterDelegateViewBinding<SearchUiModel, Any, SearchItemBinding>(
    { layoutInflater, root -> SearchItemBinding.inflate(layoutInflater, root, false) }
) {

    binding.edit.setOnEditorActionListener(TextView.OnEditorActionListener { v, actionId, event ->
        if (actionId == EditorInfo.IME_ACTION_SEARCH) {
            onSearchQuery.invoke(v.text.toString())
            return@OnEditorActionListener true
        }
        return@OnEditorActionListener false
    })

    bind {

    }
}
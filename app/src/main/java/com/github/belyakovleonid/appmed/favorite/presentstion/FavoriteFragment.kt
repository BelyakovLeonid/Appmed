package com.github.belyakovleonid.appmed.favorite.presentstion

import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.github.belyakovleonid.appmed.R
import com.github.belyakovleonid.appmed.databinding.FragmentFavoriteBinding
import com.github.belyakovleonid.appmed.databinding.FragmentProfileBinding

class FavoriteFragment: Fragment(R.layout.fragment_favorite) {

    private val binding by viewBinding(FragmentFavoriteBinding::bind)

    companion object {
        const val TAB_TAG = "FavoriteFragment"
    }
}
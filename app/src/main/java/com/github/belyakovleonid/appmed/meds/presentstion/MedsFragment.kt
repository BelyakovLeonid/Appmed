package com.github.belyakovleonid.appmed.meds.presentstion

import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.github.belyakovleonid.appmed.R
import com.github.belyakovleonid.appmed.databinding.FragmentMedsBinding
import com.github.belyakovleonid.appmed.databinding.FragmentProfileBinding

class MedsFragment: Fragment(R.layout.fragment_meds) {


    private val binding by viewBinding(FragmentMedsBinding::bind)


    companion object {
        const val TAB_TAG = "MedsFragment"
    }
}
package com.github.belyakovleonid.appmed.profile.presentstion

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.github.belyakovleonid.appmed.R
import com.github.belyakovleonid.appmed.base.presentation.utils.observeFlow
import com.github.belyakovleonid.appmed.databinding.FragmentProfileBinding
import com.github.belyakovleonid.appmed.home.presentstion.HomeViewModel
import com.github.belyakovleonid.appmed.home.presentstion.adapter.ProfileAdapter

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private val binding by viewBinding(FragmentProfileBinding::bind)
}
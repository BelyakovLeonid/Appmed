package com.github.belyakovleonid.appmed.home.presentstion

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.github.belyakovleonid.appmed.R
import com.github.belyakovleonid.appmed.base.presentation.utils.observeFlow
import com.github.belyakovleonid.appmed.databinding.FragmentHomeBinding
import com.github.belyakovleonid.appmed.home.presentstion.adapter.ProfileAdapter

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val viewModel by viewModels<HomeViewModel>()

    private val binding by viewBinding(FragmentHomeBinding::bind)

    private val profileAdapter by lazy(LazyThreadSafetyMode.NONE) {
        ProfileAdapter()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.contentList.adapter = profileAdapter
        observeFlow(viewModel.content) {
            profileAdapter.items = it
        }
    }
}
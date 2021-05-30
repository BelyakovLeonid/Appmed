package com.github.belyakovleonid.appmed.home.presentstion

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.github.belyakovleonid.appmed.R
import com.github.belyakovleonid.appmed.base.MedApp
import com.github.belyakovleonid.appmed.base.presentation.utils.observeFlow
import com.github.belyakovleonid.appmed.databinding.FragmentHomeBinding
import com.github.belyakovleonid.appmed.home.presentstion.adapter.HomeAdapter
import javax.inject.Inject

class HomeFragment : Fragment(R.layout.fragment_home) {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel by viewModels<HomeViewModel> { viewModelFactory }

    private val binding by viewBinding(FragmentHomeBinding::bind)

    private val profileAdapter by lazy(LazyThreadSafetyMode.NONE) {
        HomeAdapter(
            onSearchQuery = viewModel::onSearchQuery,
            onInfoClick = ::onInfoClick,
            onDirectionsClick = ::onDirectionsClick,
            onDoseClick = ::onDoseClick
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (requireActivity().application as MedApp).appComponent
            .inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.contentList.adapter = profileAdapter
        observeFlow(viewModel.content) {
            profileAdapter.items = it
        }
    }

    private fun onDoseClick() {
        requireActivity().findNavController(R.id.activityContent).navigate(R.id.doseFragment)
    }

    private fun onDirectionsClick() {
        viewModel.prepareToOpenDirections()
        requireActivity().findNavController(R.id.activityContent).navigate(R.id.doseFragment)
    }

    private fun onInfoClick() {
        requireActivity().findNavController(R.id.activityContent).navigate(R.id.infoFragment)
    }
}
package com.github.belyakovleonid.appmed.dose.presentation

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import by.kirich1409.viewbindingdelegate.viewBinding
import com.github.belyakovleonid.appmed.R
import com.github.belyakovleonid.appmed.base.MedApp
import com.github.belyakovleonid.appmed.base.presentation.utils.observeFlow
import com.github.belyakovleonid.appmed.databinding.FragmentDoseBinding
import com.github.belyakovleonid.appmed.dose.presentation.adapter.DoseAdapter
import javax.inject.Inject

class DoseFragment : Fragment(R.layout.fragment_dose) {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel by viewModels<DoseViewModel> { viewModelFactory }

    private val binding by viewBinding(FragmentDoseBinding::bind)

    private val doseAdapter by lazy(LazyThreadSafetyMode.NONE) {
        DoseAdapter(
            onAddProfileClick = ::onAddProfileClick,
            onSaveClick = ::onSaveClick
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (requireActivity().application as MedApp).appComponent
            .inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.contentList.adapter = doseAdapter
        observeFlow(viewModel.content) {
            doseAdapter.items = it
        }
    }

    private fun onAddProfileClick() {

    }

    private fun onSaveClick() {

    }
}
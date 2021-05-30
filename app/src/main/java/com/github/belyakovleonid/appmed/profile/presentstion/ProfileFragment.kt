package com.github.belyakovleonid.appmed.profile.presentstion

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.github.belyakovleonid.appmed.R
import com.github.belyakovleonid.appmed.base.MedApp
import com.github.belyakovleonid.appmed.base.presentation.utils.observeFlow
import com.github.belyakovleonid.appmed.databinding.FragmentProfileBinding
import javax.inject.Inject

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel by viewModels<ProfileViewModel> { viewModelFactory }

    private val binding by viewBinding(FragmentProfileBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (requireActivity().application as MedApp).appComponent
            .inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonSave.setOnClickListener {
            requireActivity().findNavController(R.id.activityContent).navigateUp()
        }
        observeFlow(viewModel.content) { item ->
            with(binding) {
                alertGroup.isVisible = item.showProductAlert
                alertTitle.text = resources.getString(R.string.alert_title, item.productAllergen)
                doctorsTitle.text = resources.getString(
                    R.string.alert_drug_title,
                    item.productName,
                    item.productAllergen
                )
            }
        }
    }
}
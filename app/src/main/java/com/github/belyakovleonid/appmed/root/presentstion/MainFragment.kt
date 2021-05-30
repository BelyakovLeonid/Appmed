package com.github.belyakovleonid.appmed.root.presentstion

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.github.belyakovleonid.appmed.R
import com.github.belyakovleonid.appmed.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private val binding by viewBinding(FragmentMainBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (savedInstanceState == null) {
            setupBottomNavigation()
        }
    }

    private fun setupBottomNavigation() {
        childFragmentManager.findFragmentById(R.id.contentContainer)?.findNavController()?.let {
            binding.bottomNav.setupWithNavController(it)
            binding.bottomNav.setOnNavigationItemReselectedListener {
                // Do nothing to ignore the reselection
            }
        }
    }
}
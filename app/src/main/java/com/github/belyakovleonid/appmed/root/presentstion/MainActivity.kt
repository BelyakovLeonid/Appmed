package com.github.belyakovleonid.appmed.root.presentstion

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.github.belyakovleonid.appmed.R
import com.github.belyakovleonid.appmed.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val binding by viewBinding(ActivityMainBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.bottomNav.setupWithNavController(findNavController(R.id.contentContainer))
        binding.bottomNav.setOnNavigationItemReselectedListener {
            // Do nothing to ignore the reselection
        }
    }
}

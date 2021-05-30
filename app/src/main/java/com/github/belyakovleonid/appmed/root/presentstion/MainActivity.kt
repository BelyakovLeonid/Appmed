package com.github.belyakovleonid.appmed.root.presentstion

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.github.belyakovleonid.appmed.R

class MainActivity : AppCompatActivity(R.layout.activity_main) {

//    override fun onSupportNavigateUp() = findNavController(R.id.activityContent).navigateUp()

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        Log.d("MyTag", "0 = ${findNavController(R.id.activityContent).hashCode()}")
        super.onCreate(savedInstanceState, persistentState)
    }
}

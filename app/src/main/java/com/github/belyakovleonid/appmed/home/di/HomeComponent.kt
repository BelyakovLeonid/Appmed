package com.github.belyakovleonid.appmed.home.di

import com.github.belyakovleonid.appmed.home.presentstion.HomeFragment
import dagger.Subcomponent

@Subcomponent(
    modules = [HomeModule::class]
)
interface HomeComponent {

    fun inject(fragment: HomeFragment)

    @Subcomponent.Factory
    interface Factory {
        fun create(): HomeComponent
    }
}
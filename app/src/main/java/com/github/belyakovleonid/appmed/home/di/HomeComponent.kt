package com.github.belyakovleonid.appmed.home.di

import com.github.belyakovleonid.appmed.home.presentstion.HomeFragment
import dagger.Subcomponent
import javax.inject.Singleton

@Subcomponent(
    modules = [HomeModule::class]
)
@Singleton
interface HomeComponent {

    fun inject(fragment: HomeFragment)

    @Subcomponent.Factory
    interface Factory {
        fun create(): HomeComponent
    }
}
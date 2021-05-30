package com.github.belyakovleonid.appmed.base.di

import com.github.belyakovleonid.appmed.base.di.viewmodel.ViewModelBuilderModule
import com.github.belyakovleonid.appmed.base.di.viewmodel.ViewModelModule
import com.github.belyakovleonid.appmed.dose.presentation.DoseFragment
import com.github.belyakovleonid.appmed.home.presentstion.HomeFragment
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [
        ProductsBusinessLogicModule::class,
        ViewModelModule::class,
        ViewModelBuilderModule::class
    ]
)
@Singleton
interface AppComponent {

    fun inject(fragment: DoseFragment)
    fun inject(fragment: HomeFragment)
}
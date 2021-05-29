package com.github.belyakovleonid.appmed.base.di

import com.github.belyakovleonid.appmed.base.di.viewmodel.ViewModelBuilderModule
import com.github.belyakovleonid.appmed.home.di.HomeComponent
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [
        SubcomponentsModule::class,
        ViewModelBuilderModule::class
    ]
)
interface AppComponent {

    fun homeComponent(): HomeComponent.Factory
}
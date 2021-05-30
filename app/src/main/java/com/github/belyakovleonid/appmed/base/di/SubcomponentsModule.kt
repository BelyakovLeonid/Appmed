package com.github.belyakovleonid.appmed.base.di

import com.github.belyakovleonid.appmed.dose.di.DoseComponent
import com.github.belyakovleonid.appmed.home.di.HomeComponent
import dagger.Module

@Module(
    subcomponents = [
        HomeComponent::class,
        DoseComponent::class
    ]
)
interface SubcomponentsModule {

}
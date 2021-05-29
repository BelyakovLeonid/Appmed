package com.github.belyakovleonid.appmed.dose.di

import com.github.belyakovleonid.appmed.dose.presentation.DoseFragment
import dagger.Component
import dagger.Subcomponent

@Subcomponent(
    modules = [DoseModule::class]
)
interface DoseComponent {

    fun inject(fragment: DoseFragment)

    @Subcomponent.Factory
    interface Factory{
        fun create(): DoseComponent
    }
}
package com.github.belyakovleonid.appmed.dose.di

import androidx.lifecycle.ViewModel
import com.github.belyakovleonid.appmed.base.di.viewmodel.ViewModelKey
import com.github.belyakovleonid.appmed.dose.presentation.DoseViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface DoseModule {

    @Binds
    @IntoMap
    @ViewModelKey(DoseViewModel::class)
    fun bindViewModel(viewModel: DoseViewModel): ViewModel
}
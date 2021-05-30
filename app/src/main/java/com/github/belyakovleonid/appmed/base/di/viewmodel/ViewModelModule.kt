package com.github.belyakovleonid.appmed.base.di.viewmodel

import androidx.lifecycle.ViewModel
import com.github.belyakovleonid.appmed.dose.presentation.DoseViewModel
import com.github.belyakovleonid.appmed.home.presentstion.HomeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    fun bindHomeViewModel(viewModel: HomeViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(DoseViewModel::class)
    fun bindDoseViewModel(viewModel: DoseViewModel): ViewModel
}
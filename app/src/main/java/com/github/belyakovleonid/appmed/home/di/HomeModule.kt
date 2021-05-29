package com.github.belyakovleonid.appmed.home.di

import androidx.lifecycle.ViewModel
import com.github.belyakovleonid.appmed.base.di.viewmodel.ViewModelKey
import com.github.belyakovleonid.appmed.home.data.ProductsRepositoryImpl
import com.github.belyakovleonid.appmed.home.data.remote.ProductsApi
import com.github.belyakovleonid.appmed.home.data.remote.ProductsApiMocked
import com.github.belyakovleonid.appmed.home.domain.ProductsRepository
import com.github.belyakovleonid.appmed.home.presentstion.HomeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface HomeModule {

    @Binds
    fun bindApi(api: ProductsApiMocked): ProductsApi

    @Binds
    fun bindRepository(repo: ProductsRepositoryImpl): ProductsRepository

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    fun bindViewModel(viewModel: HomeViewModel): ViewModel
}
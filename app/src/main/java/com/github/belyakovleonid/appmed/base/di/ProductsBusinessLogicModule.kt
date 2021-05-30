package com.github.belyakovleonid.appmed.base.di

import com.github.belyakovleonid.appmed.home.data.ProductsRepositoryImpl
import com.github.belyakovleonid.appmed.home.data.remote.ProductsApi
import com.github.belyakovleonid.appmed.home.data.remote.ProductsApiMocked
import com.github.belyakovleonid.appmed.home.domain.ProductsRepository
import com.github.belyakovleonid.appmed.home.presentstion.components.search.ISearchComponent
import com.github.belyakovleonid.appmed.home.presentstion.components.search.SearchComponent
import dagger.Binds
import dagger.Module

@Module
interface ProductsBusinessLogicModule {

    @Binds
    fun bindApi(api: ProductsApiMocked): ProductsApi

    @Binds
    fun bindRepository(repo: ProductsRepositoryImpl): ProductsRepository

    @Binds
    fun bindSearchComponent(component: SearchComponent): ISearchComponent
}
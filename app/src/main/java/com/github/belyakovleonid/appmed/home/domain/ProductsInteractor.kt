package com.github.belyakovleonid.appmed.home.domain

import android.util.Log
import com.github.belyakovleonid.appmed.home.domain.model.Product
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProductsInteractor @Inject constructor(
    private val repository: ProductsRepository
) {

    private val searchedProducts = MutableStateFlow<List<Product>?>(null)
    private val doseFilters = MutableStateFlow(null)
    private val searchQuery = MutableStateFlow("")

    fun setSearchQuery(query: String) {
        searchQuery.tryEmit(query)
        searchedProducts.tryEmit(repository.getProductsByQuery(query))
    }

    fun subscribeToSearchedProducts(): Flow<List<Product>?> {
        return searchedProducts
    }

    fun subscribeToSearchQuery(): Flow<String> {
        return searchQuery.asStateFlow()
    }
}
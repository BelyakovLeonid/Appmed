package com.github.belyakovleonid.appmed.home.domain

import com.github.belyakovleonid.appmed.home.domain.model.Product
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProductsInteractor @Inject constructor(
    private val repository: ProductsRepository
) {

    private val searchedProducts = MutableStateFlow<List<Product>?>(null)

    fun setSearchQuery(query: String) {
        searchedProducts.tryEmit(repository.getProductsByQuery(query))
    }

    fun subscribeToSearchedProducts(): Flow<List<Product>?> {
        return searchedProducts
    }

    fun getCurrentProduct(): Product? {
        return searchedProducts.value?.first()
    }
}
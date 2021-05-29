package com.github.belyakovleonid.appmed.home.domain

import com.github.belyakovleonid.appmed.home.domain.model.Product
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class ProductsInteractor @Inject constructor(
    private val repository: ProductsRepository
) {

    private val searchedProducts = MutableStateFlow<List<Product>?>(null)
    private val doseFilters = MutableStateFlow(null)
    private val searchQuery = MutableStateFlow("")

    fun setSearchQuery(query: String) {
        searchQuery.value = query
        searchedProducts.value = repository.getProductsByQuery(query)
    }

    fun subscribeToSearchedProducts(): Flow<List<Product>> {
        return searchedProducts.filterNotNull()
    }

    fun subscribeToAllergensInSearchedProducts(): Flow<Set<String>> {
        return searchedProducts.map { products ->
            products?.flatMap { product -> product.allergens }?.toSet() ?: emptySet()
        }
    }

    fun subscribeToSearchQuery(): Flow<String> {
        return searchQuery.asStateFlow()
    }
}
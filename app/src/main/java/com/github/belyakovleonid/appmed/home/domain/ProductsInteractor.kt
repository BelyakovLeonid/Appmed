package com.github.belyakovleonid.appmed.home.domain

import android.util.Log
import com.github.belyakovleonid.appmed.home.domain.model.DrugScheme
import com.github.belyakovleonid.appmed.home.domain.model.Product
import com.github.belyakovleonid.appmed.profile.domain.ProfileInteractor
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.filterNotNull
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProductsInteractor @Inject constructor(
    private val profileInteractor: ProfileInteractor,
    private val repository: ProductsRepository
) {

    private val searchedProducts = MutableStateFlow<List<Product>?>(null)
    private val searchedQuery = MutableStateFlow<String?>(null)

    private val drugScheme = combine(
        searchedQuery,
        profileInteractor.subscribeToProfileData()
    ){ query, profile ->
        Log.d("MyTag", "loadDefaultSchemeByQueryAndProfile = ${repository.loadDefaultSchemeByQueryAndProfile(query, profile)}")
        repository.loadDefaultSchemeByQueryAndProfile(query, profile)

    }

    fun setSearchQuery(query: String) {
        searchedQuery.value = query
        searchedProducts.tryEmit(repository.getProductsByQuery(query))
    }

    fun subscribeToSearchedProducts(): Flow<List<Product>?> {
        return combine(
            searchedProducts,
            drugScheme
        ){ products, scheme ->
            products?.filter { it.defaultPortionMg >= (scheme?.defaultPortionMg ?: 0)}
        }
    }

    fun getCurrentProduct(): Product? {
        return searchedProducts.value?.first()
    }

    fun subscribeToScheme(): Flow<DrugScheme> {
        return drugScheme.filterNotNull()
    }
}
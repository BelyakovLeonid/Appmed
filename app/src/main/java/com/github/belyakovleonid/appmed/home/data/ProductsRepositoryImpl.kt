package com.github.belyakovleonid.appmed.home.data

import com.github.belyakovleonid.appmed.home.data.remote.ProductsApi
import com.github.belyakovleonid.appmed.home.data.remote.model.toDomain
import com.github.belyakovleonid.appmed.home.domain.ProductsRepository
import com.github.belyakovleonid.appmed.home.domain.model.DrugScheme
import com.github.belyakovleonid.appmed.home.domain.model.Product
import com.github.belyakovleonid.appmed.profile.domain.model.ProfileData
import javax.inject.Inject

class ProductsRepositoryImpl @Inject constructor(
    private val productsApi: ProductsApi
) : ProductsRepository {

    override fun getProductsByQuery(query: String): List<Product> {
        return productsApi.loadProductsByQuery(query).map { it.toDomain() }
    }

    override fun loadDefaultSchemeByQueryAndProfile(query: String?, profile: ProfileData?): DrugScheme? {
        return productsApi.loadDefaultSchemeByQueryAndProfile(query, profile)
    }
}
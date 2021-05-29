package com.github.belyakovleonid.appmed.home.data

import com.github.belyakovleonid.appmed.home.data.remote.ProductsApi
import com.github.belyakovleonid.appmed.home.data.remote.model.toDomain
import com.github.belyakovleonid.appmed.home.domain.ProductsRepository
import com.github.belyakovleonid.appmed.home.domain.model.Product
import javax.inject.Inject

class ProductsRepositoryImpl @Inject constructor(
    private val productsApi: ProductsApi
) : ProductsRepository {

    override fun getProductsByQuery(query: String): List<Product> {
        return productsApi.loadProductsByQuery(query).map { it.toDomain() }
    }
}
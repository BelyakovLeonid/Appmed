package com.github.belyakovleonid.appmed.home.data

import com.github.belyakovleonid.appmed.home.domain.ProductsRepository
import com.github.belyakovleonid.appmed.home.domain.model.Product

class ProductsRepositoryImpl(
    private val productsApi: ProductsApi
) : ProductsRepository {

    override fun getProductsByQuery(query: String): List<Product> {

    }
}
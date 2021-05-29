package com.github.belyakovleonid.appmed.home.domain

import com.github.belyakovleonid.appmed.home.domain.model.Product

interface ProductsRepository {
    fun getProductsByQuery(query: String): List<Product>
}
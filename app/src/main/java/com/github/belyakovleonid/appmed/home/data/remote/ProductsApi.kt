package com.github.belyakovleonid.appmed.home.data.remote

import com.github.belyakovleonid.appmed.home.data.remote.model.ProductDto

interface ProductsApi {
    fun loadProductsByQuery(query: String) : List<ProductDto>
}
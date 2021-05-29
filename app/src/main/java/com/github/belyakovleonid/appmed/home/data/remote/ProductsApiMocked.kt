package com.github.belyakovleonid.appmed.home.data.remote

import com.github.belyakovleonid.appmed.home.data.remote.model.ProductDto

/**
 * Фейковые данные якобы от бэка
 */
class ProductsApiMocked : ProductsApi {

    override fun loadProductsByQuery(query: String) = when (query) {
        HARDCODED_QUERY_1 -> {
            listOf(
                ProductDto(
                    id = 1L,
                    name = "Амоксиклав, таблетки 625мг, 14шт."

                )
            )
        }
        HARDCODED_QUERY_2 -> {
            listOf(

            )
        }
        else -> emptyList()
    }

    companion object {
        private const val HARDCODED_QUERY_1 = "Амоксиклав"
        private const val HARDCODED_QUERY_2 = "Аскорбинка"
    }
}
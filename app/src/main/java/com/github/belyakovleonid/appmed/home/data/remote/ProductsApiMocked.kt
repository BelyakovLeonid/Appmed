package com.github.belyakovleonid.appmed.home.data.remote

import com.github.belyakovleonid.appmed.home.data.remote.model.ProductDto
import javax.inject.Inject

/**
 * Фейковые данные якобы от бэка
 */
class ProductsApiMocked @Inject constructor() : ProductsApi {

    override fun loadProductsByQuery(query: String) = when (query) {
        HARDCODED_QUERY_1 -> {
            listOf(
                ProductDto(
                    id = 1L,
                    name = "Амоксиклав, таблетки 625мг, 14шт.",
                    allergens = listOf("Пеницилин")
                ),
                ProductDto(
                    id = 1L,
                    name = "Амоксиклав, суспензия, флакон 12,6г",
                    allergens = listOf("Пеницилин")
                ),
                ProductDto(
                    id = 1L,
                    name = "Амоксиклав, таблетки 200мг, 24шт.",
                    allergens = listOf("Пеницилин")
                ),
            )
        }
        HARDCODED_QUERY_2 -> {
            listOf(
                ProductDto(
                    id = 1L,
                    name = "Аскорбинка, таблетки 625мг, 14шт.",
                    allergens = emptyList()
                ),
                ProductDto(
                    id = 1L,
                    name = "Аскорбинка, таблетки 35мг, 4шт.",
                    allergens = emptyList()
                ),
            )
        }
        else -> emptyList()
    }

    companion object {
        private const val HARDCODED_QUERY_1 = "Амоксиклав"
        private const val HARDCODED_QUERY_2 = "Аскорбинка"
    }
}
package com.github.belyakovleonid.appmed.home.data.remote

import com.github.belyakovleonid.appmed.R
import com.github.belyakovleonid.appmed.home.data.remote.model.ProductDto
import java.util.Locale
import javax.inject.Inject

/**
 * Фейковые данные якобы от бэка
 */
class ProductsApiMocked @Inject constructor() : ProductsApi {

    override fun loadProductsByQuery(query: String) = when (query.lowercase(Locale.getDefault())) {
        HARDCODED_QUERY_1 -> {
            listOf(
                ProductDto(
                    id = 1L,
                    rate = 4.56f,
                    name = "Амоксиклав",
                    dose = "таблетки 875мг, 14шт.",
                    allergens = listOf("Пеницилин"),
                    description = "Таблетки, покрытые пленочной оболочкой",
                    imageResId = R.drawable.img_aug_2,
                    oldPrice = 190,
                    newPrice = 155,
                    isAvailable = true,
                    isRecipe = true,
                    defaultPortionMg = 500,
                    defaultCountPerDay = 3,
                    defaultCourseDays = 5,
                ),
                ProductDto(
                    id = 2L,
                    rate = 4.88f,
                    name = "Амоксиклав",
                    dose = "порошок 125мг, 31мл.",
                    allergens = listOf("Пеницилин"),
                    description = "Порошок для приема внутрь",
                    imageResId = R.drawable.img_aug_3,
                    oldPrice = 290,
                    newPrice = 185,
                    isAvailable = false,
                    isRecipe = true,
                    defaultPortionMg = 500,
                    defaultCountPerDay = 3,
                    defaultCourseDays = 5,
                ),
                ProductDto(
                    id = 3L,
                    rate = 3.76f,
                    name = "Амоксиклав",
                    dose = "порошок 500мг, 14мл.",
                    allergens = listOf("Пеницилин"),
                    description = "Таблетки, покрытые пленочной оболочкой",
                    imageResId = R.drawable.img_aug_1,
                    oldPrice = 150,
                    newPrice = 125,
                    isAvailable = true,
                    isRecipe = true,
                    defaultPortionMg = 500,
                    defaultCountPerDay = 3,
                    defaultCourseDays = 5,
                ),
            )
        }
        HARDCODED_QUERY_2 -> {
            listOf(
                ProductDto(
                    id = 4L,
                    rate = 5f,
                    name = "Аскорбиновая кислота с глюкозой",
                    dose = "40шт.",
                    allergens = emptyList(),
                    description = "Полезно детям",
                    imageResId = R.drawable.img_asc_1,
                    oldPrice = 150,
                    newPrice = 125,
                    isAvailable = true,
                    isRecipe = false,
                    defaultPortionMg = 300,
                    defaultCountPerDay = 2,
                    defaultCourseDays = 15,
                ),
                ProductDto(
                    id = 5L,
                    rate = 4f,
                    name = "Аскорбиновая кислота",
                    dose = "40шт.",
                    allergens = emptyList(),
                    description = "Полезно детям",
                    imageResId = R.drawable.img_asc_2,
                    oldPrice = 150,
                    newPrice = 125,
                    isAvailable = false,
                    isRecipe = false,
                    defaultPortionMg = 300,
                    defaultCountPerDay = 2,
                    defaultCourseDays = 15,
                ),
            )
        }
        else -> emptyList()
    }

    companion object {
        private const val HARDCODED_QUERY_1 = "амоксиклав"
        private const val HARDCODED_QUERY_2 = "аскорбинка"
    }
}
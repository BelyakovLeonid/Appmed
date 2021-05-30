package com.github.belyakovleonid.appmed.home.domain

import com.github.belyakovleonid.appmed.home.domain.model.DrugScheme
import com.github.belyakovleonid.appmed.home.domain.model.Product
import com.github.belyakovleonid.appmed.profile.domain.model.ProfileData

interface ProductsRepository {
    fun getProductsByQuery(query: String): List<Product>
    fun loadDefaultSchemeByQueryAndProfile(query: String?, profile: ProfileData?): DrugScheme?

}
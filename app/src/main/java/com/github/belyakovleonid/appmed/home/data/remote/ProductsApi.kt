package com.github.belyakovleonid.appmed.home.data.remote

import com.github.belyakovleonid.appmed.home.data.remote.model.ProductDto
import com.github.belyakovleonid.appmed.home.domain.model.DrugScheme
import com.github.belyakovleonid.appmed.profile.domain.model.ProfileData

interface ProductsApi {
    fun loadProductsByQuery(query: String): List<ProductDto>
    fun loadDefaultSchemeByQueryAndProfile(query: String?, profile: ProfileData?): DrugScheme?
}
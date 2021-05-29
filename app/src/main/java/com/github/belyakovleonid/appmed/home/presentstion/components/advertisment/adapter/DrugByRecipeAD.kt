package com.github.belyakovleonid.appmed.home.presentstion.components.advertisment.adapter

import com.github.belyakovleonid.appmed.R
import com.github.belyakovleonid.appmed.home.presentstion.components.advertisment.model.DrugByRecipeUiModel
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegate

fun drugByRecipeAD() = adapterDelegate<DrugByRecipeUiModel, Any>(
    R.layout.drag_by_recipe_item
) {}
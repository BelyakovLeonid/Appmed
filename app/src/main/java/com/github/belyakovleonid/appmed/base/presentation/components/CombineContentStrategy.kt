package com.github.belyakovleonid.appmed.base.presentation.components

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine

open class CombineContentStrategy : ComponentStrategy<List<Any>, List<Any>> {
    override fun unionMethod(flows: List<Flow<List<Any>>>): Flow<List<Any>> {
        return combine(flows) { array ->
            array.flatMap { it }
        }
    }
}
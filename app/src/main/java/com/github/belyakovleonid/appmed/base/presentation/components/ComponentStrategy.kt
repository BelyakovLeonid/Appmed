package com.github.belyakovleonid.appmed.base.presentation.components

import kotlinx.coroutines.flow.Flow

interface ComponentStrategy<T, out R> {
    fun unionMethod(flows: List<Flow<T>>): Flow<R>
}
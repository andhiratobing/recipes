package com.art.android.recipes.data.network

import com.art.android.abstraction.dispatcher.IoDispatcher
import com.art.android.recipes.data.network.api.ApiService
import com.art.android.recipes.data.network.models.RecipeResponse
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * @author andhiratobing
 * @project RecipesRepository
 */

class RemoteDataSourceImpl @Inject constructor(
    private val apiService: ApiService,
    @IoDispatcher val dispatcher: CoroutineDispatcher
) : RemoteDataSource {

    override suspend fun getRecipes(): RecipeResponse {
        return withContext(dispatcher) {
            apiService.getRecipes()
        }
    }
}
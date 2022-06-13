package com.art.android.recipes.data.repository

import com.art.android.recipes.data.network.RemoteDataSource
import com.art.android.recipes.data.network.models.asDomain
import com.art.android.recipes.domain.models.Recipe
import com.art.android.recipes.domain.respository.RecipesRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

/**
 * @author andhiratobing
 * @project Recipes
 */

class RecipesRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : RecipesRepository {
    override fun getRecipes(): Flow<List<Recipe>> {
        return flow {
            val result = remoteDataSource.getRecipes().asDomain().results
            emit(result)
        }
    }
}
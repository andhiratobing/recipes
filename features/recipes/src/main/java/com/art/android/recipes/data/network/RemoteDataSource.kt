package com.art.android.recipes.data.network

import com.art.android.recipes.data.network.models.RecipeResponse

/**
 * @author andhiratobing
 * @project RecipesRepository
 */

interface RemoteDataSource {

    suspend fun getRecipes(): RecipeResponse

}
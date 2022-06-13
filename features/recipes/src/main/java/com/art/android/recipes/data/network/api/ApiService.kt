package com.art.android.recipes.data.network.api

import com.art.android.recipes.data.network.models.RecipeResponse

/**
 * @author andhiratobing
 * @project RecipesRepository
 */

interface ApiService {

    suspend fun getRecipes(): RecipeResponse
}
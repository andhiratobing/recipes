package com.art.android.recipes.domain.respository

import com.art.android.recipes.domain.models.Recipe
import kotlinx.coroutines.flow.Flow

/**
 * @author andhiratobing
 * @project RecipesRepository
 */
interface RecipesRepository {

    fun getRecipes(): Flow<List<Recipe>>
}
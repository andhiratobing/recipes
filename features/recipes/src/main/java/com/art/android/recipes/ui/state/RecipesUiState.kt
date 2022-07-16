package com.art.android.recipes.ui.state

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import com.art.android.abstraction.state.ResponseState
import com.art.android.recipes.domain.models.Recipe

/**
 * @author andhiratobing
 * @project Recipes
 */

@Stable
@Immutable
data class RecipesUiState(
    val recipe: Recipe = Recipe.RECIPE_EMPTY,
    val responseState: ResponseState<List<Recipe>>? = null
)
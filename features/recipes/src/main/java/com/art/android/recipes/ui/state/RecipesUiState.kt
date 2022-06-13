package com.art.android.recipes.ui.state

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import com.art.android.recipes.domain.models.Recipe

/**
 * @author andhiratobing
 * @project Recipes
 */

@Stable
@Immutable
data class RecipesUiState(

    val responseState: ResponseState? = null
)

@Stable
sealed interface ResponseState {
    data class Success(val data: List<Recipe>) : ResponseState
    data class Error(val message: String) : ResponseState
    object Loading : ResponseState
    object Completion : ResponseState
}
package com.art.android.recipes.ui

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.art.android.components.lottie.ArtLottie
import com.art.android.recipes.ui.state.RecipesUiState
import com.art.android.recipes.ui.state.ResponseState
import com.art.android.components.R as components

/**
 * @author andhiratobing
 * @project RecipesRepository
 */

@Composable
fun RecipesContent(
    modifier: Modifier = Modifier,
    uiState: RecipesUiState
) {

    Surface(
        modifier = modifier
    ) {
        Result(uiState = uiState)
    }

}

@Composable
private fun Result(
    uiState: RecipesUiState
) {
    when (uiState.responseState) {
        is ResponseState.Loading -> {
            ArtLottie(resource = components.raw.loading)
        }
        is ResponseState.Error -> {

        }
        is ResponseState.Success -> {

        }
        is ResponseState.Completion -> {

        }
        else -> Unit
    }
}
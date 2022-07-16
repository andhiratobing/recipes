package com.art.android.recipes.ui

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.art.android.abstraction.state.ResponseState
import com.art.android.components.R
import com.art.android.components.lottie.ArtLottie
import com.art.android.recipes.ui.state.RecipesUiState
import com.art.android.recipes.ui.viewmodel.RecipesViewModel

/**
 * @author andhiratobing
 * @project RecipesRepository
 */

@ExperimentalMaterial3Api
@Composable
fun RecipesScreen(
    viewModel: RecipesViewModel = hiltViewModel()
) {

    val uiState by viewModel.uiState.collectAsState()

    Result(uiState = uiState)

    RecipesContent(
        uiState = uiState
    )
}

@Composable
private fun Result(
    uiState: RecipesUiState
) {
    when (uiState.responseState) {
        is ResponseState.Loading -> {
            ArtLottie(resource = R.raw.loading)
        }
        is ResponseState.Error -> {

        }
        is ResponseState.Success -> {

        }
        else -> Unit
    }
}
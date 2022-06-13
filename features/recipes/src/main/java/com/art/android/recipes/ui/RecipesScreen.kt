package com.art.android.recipes.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.art.android.recipes.ui.viewmodel.RecipesViewModel

/**
 * @author andhiratobing
 * @project RecipesRepository
 */

@Composable
fun RecipesScreen(
    viewModel: RecipesViewModel = hiltViewModel()
) {

    val uiState by viewModel.uiState.collectAsState()

    RecipesContent(
        uiState = uiState
    )
}
package com.art.android.recipes.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.art.android.abstraction.state.ResultState
import com.art.android.recipes.domain.usecase.GetRecipesUseCase
import com.art.android.recipes.ui.state.RecipesUiState
import com.art.android.recipes.ui.state.ResponseState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * @author andhiratobing
 * @project Recipes
 */

@HiltViewModel
class RecipesViewModel @Inject constructor(
    private val getRecipesUseCase: GetRecipesUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(RecipesUiState())
    val uiState get() = _uiState.asStateFlow()


    init {
        getRecipes()
    }

    private fun getRecipes() {
        viewModelScope.launch {
            getRecipesUseCase.invoke().onEach { state ->
                val responseState = when (state) {
                    is ResultState.Loading -> {
                        ResponseState.Loading
                    }
                    is ResultState.Success -> {
                        ResponseState.Success(state.data)
                    }
                    is ResultState.Error -> {
                        ResponseState.Error(state.exception?.message ?: "")
                    }
                    is ResultState.Completion -> {
                        ResponseState.Completion
                    }
                }
                _uiState.update { it.copy(responseState = responseState) }

                Log.d("Data", "$responseState")
            }.collect()
        }
    }

}
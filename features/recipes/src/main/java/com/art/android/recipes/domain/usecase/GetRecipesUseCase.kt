package com.art.android.recipes.domain.usecase

import com.art.android.abstraction.state.ResultState
import com.art.android.recipes.domain.models.Recipe
import kotlinx.coroutines.flow.Flow

/**
 * @author andhiratobing
 * @project RecipesRepository
 */
interface GetRecipesUseCase {

    operator fun invoke(): Flow<ResultState<List<Recipe>>>
}
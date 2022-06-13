package com.art.android.recipes.domain.usecase

import com.art.android.abstraction.state.ResultState
import com.art.android.abstraction.state.asResult
import com.art.android.recipes.domain.models.Recipe
import com.art.android.recipes.domain.respository.RecipesRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * @author andhiratobing
 * @project Recipes
 */
class GetRecipesUseCaseImpl @Inject constructor(
    private val recipesRepository: RecipesRepository
) : GetRecipesUseCase {

    override fun invoke(): Flow<ResultState<List<Recipe>>> {
        return recipesRepository.getRecipes().asResult()
    }
}
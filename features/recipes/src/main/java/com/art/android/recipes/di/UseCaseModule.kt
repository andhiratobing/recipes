package com.art.android.recipes.di

import com.art.android.recipes.domain.usecase.GetRecipesUseCase
import com.art.android.recipes.domain.usecase.GetRecipesUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

/**
 * @author andhiratobing
 * @project Recipes
 */

@Module
@InstallIn(ViewModelComponent::class)
abstract class UseCaseModule {

    @Binds
    @ViewModelScoped
    abstract fun bindRecipeUseCase(
        useCaseImpl: GetRecipesUseCaseImpl
    ): GetRecipesUseCase
}
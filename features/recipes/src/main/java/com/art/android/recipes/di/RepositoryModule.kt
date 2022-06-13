package com.art.android.recipes.di

import com.art.android.recipes.data.repository.RecipesRepositoryImpl
import com.art.android.recipes.domain.respository.RecipesRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @author andhiratobing
 * @project Recipes
 */

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindRepository(
        repositoryImpl: RecipesRepositoryImpl
    ): RecipesRepository

}
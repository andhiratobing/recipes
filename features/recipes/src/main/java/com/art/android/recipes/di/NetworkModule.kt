package com.art.android.recipes.di

import com.art.android.recipes.data.network.api.ApiService
import com.art.android.recipes.data.network.api.ApiServiceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.*
import javax.inject.Singleton

/**
 * @author andhiratobing
 * @project Recipes
 */

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideApiService(
        httpClient: HttpClient
    ): ApiService {
        return ApiServiceImpl(httpClient)
    }
}
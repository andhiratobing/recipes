package com.art.android.recipes.di

import com.art.android.recipes.data.network.RemoteDataSource
import com.art.android.recipes.data.network.RemoteDataSourceImpl
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
abstract class DataSourceModule {

    @Binds
    @Singleton
    abstract fun bindRemoteDataSource(
        dataSourceImpl: RemoteDataSourceImpl
    ): RemoteDataSource
}
package com.art.android.abstraction.di

import com.art.android.abstraction.dispatcher.DefaultDispatcher
import com.art.android.abstraction.dispatcher.IoDispatcher
import com.art.android.abstraction.dispatcher.MainDispatcher
import com.art.android.abstraction.dispatcher.UnconfinedDispatcher
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

/**
 * @author andhiratobing
 * @project Recipes
 */

@Module
@InstallIn(SingletonComponent::class)
object DispatcherModule {

    @IoDispatcher
    @Provides
    @Singleton
    fun provideIoDispatcher(): CoroutineDispatcher = Dispatchers.IO

    @MainDispatcher
    @Provides
    @Singleton
    fun provideMainDispatcher(): CoroutineDispatcher = Dispatchers.Main

    @UnconfinedDispatcher
    @Provides
    @Singleton
    fun provideUnconfinedDispatcher(): CoroutineDispatcher = Dispatchers.Unconfined

    @DefaultDispatcher
    @Provides
    @Singleton
    fun provideDefaultDispatcher(): CoroutineDispatcher = Dispatchers.Default
}
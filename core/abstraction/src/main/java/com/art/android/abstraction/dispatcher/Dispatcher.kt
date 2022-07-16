package com.art.android.abstraction.dispatcher

import javax.inject.Qualifier

/**
 * @author andhiratobing
 * @project Recipes
 */


@Qualifier
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class IoDispatcher

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class MainDispatcher

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class UnconfinedDispatcher

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class DefaultDispatcher
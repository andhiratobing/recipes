package com.art.android.abstraction.state

import kotlinx.coroutines.flow.*

/**
 * @author andhiratobing
 * @project Recipes
 */

/**
 * Result state
 * @Success success status is used to handle result data successfully
 * @Error error status is used to handle data when an exception occurs
 * @Loading loading status is used to process when data is being requested
 * @Completion status completion is used to do something whether the data request was successfully requested or failed
 */
sealed interface ResultState<out T> {

    data class Success<T>(val data: T) : ResultState<T>

    data class Error(val exception: Throwable? = null) : ResultState<Nothing>

    object Loading : ResultState<Nothing>

    object Completion : ResultState<Nothing>
}

/**
 * Get result from source
 */
fun <T> Flow<T>.asResult(): Flow<ResultState<T>> {
    return this.map<T, ResultState<T>> {
        ResultState.Success(it)
    }.onStart {
        emit(ResultState.Loading)
    }.catch { error ->
        emit(ResultState.Error(error))
    }.onCompletion {
        emit(ResultState.Completion)
    }
}
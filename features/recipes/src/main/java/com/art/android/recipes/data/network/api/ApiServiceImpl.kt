package com.art.android.recipes.data.network.api

import com.art.android.recipes.data.network.models.RecipeResponse
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*
import javax.inject.Inject

/**
 * @author andhiratobing
 * @project RecipesRepository
 */

class ApiServiceImpl @Inject constructor(
    private val httpClient: HttpClient
) : ApiService {

    override suspend fun getRecipes(): RecipeResponse {
        return httpClient.get {
            url {
                path("recipes/complexSearch")
            }
        }.body()
    }
}
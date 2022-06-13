package com.art.android.recipes.data.network.models

import com.art.android.recipes.domain.models.RecipeDomain
import kotlinx.serialization.Serializable

@Serializable
data class RecipeResponse(
    val number: Int,
    val offset: Int,
    val results: List<RecipeDto>,
    val totalResults: Int
)

fun RecipeResponse.asDomain(): RecipeDomain {
    return RecipeDomain(
        number = this.number,
        offset = this.offset,
        results = this.results.asDomains(),
        totalResults = this.totalResults
    )
}
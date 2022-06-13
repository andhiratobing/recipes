package com.art.android.recipes.data.network.models

import com.art.android.recipes.domain.models.Recipe
import kotlinx.serialization.Serializable

@Serializable
data class RecipeDto(
    val id: Int,
    val image: String,
    val imageType: String,
    val title: String
)

fun RecipeDto.asDomain(): Recipe {
    return Recipe(
        id = this.id,
        image = this.image,
        imageType = this.imageType,
        title = this.title
    )
}

fun List<RecipeDto>.asDomains(): List<Recipe> {
    return this.map { it.asDomain() }
}
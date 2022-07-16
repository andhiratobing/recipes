package com.art.android.recipes.domain.models

data class Recipe(
    val id: Int,
    val image: String,
    val imageType: String,
    val title: String
) {

    companion object {
        val RECIPE_EMPTY = Recipe(
            id = 0,
            image = "",
            imageType = "",
            title = ""
        )
    }
}
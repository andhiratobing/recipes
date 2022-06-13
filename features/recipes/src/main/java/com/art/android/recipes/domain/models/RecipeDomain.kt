package com.art.android.recipes.domain.models

data class RecipeDomain(
    val number: Int,
    val offset: Int,
    val results: List<Recipe>,
    val totalResults: Int
)
package com.art.android.recipes.data.network.models

import com.art.android.recipes.data.network.utils.FakeDataSource
import org.junit.Assert.assertEquals
import org.junit.Test


class RecipeDtoTest {

    @Test
    fun `recipe dto can be mapped to recipe`() {
        // Mock
        val recipeDto = FakeDataSource.recipeDto
        // Mapper dto to domain
        val result = recipeDto.asDomain()

        assertEquals(FakeDataSource.recipe, result)
    }
}
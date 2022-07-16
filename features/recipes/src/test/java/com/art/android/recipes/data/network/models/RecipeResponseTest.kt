package com.art.android.recipes.data.network.models

import com.art.android.recipes.data.network.utils.FakeDataSource
import org.junit.Test
import kotlin.test.assertEquals

class RecipeResponseTest {

    @Test
    fun `recipe response can be mapped to recipe domain`() {
        // Mapper response dto to domain
        val result = FakeDataSource.recipeResponse.asDomain()

        assertEquals(FakeDataSource.recipeDomain, result)
    }
}
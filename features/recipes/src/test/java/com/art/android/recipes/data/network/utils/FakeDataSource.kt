package com.art.android.recipes.data.network.utils

import com.art.android.recipes.data.network.models.RecipeDto
import com.art.android.recipes.data.network.models.RecipeResponse
import com.art.android.recipes.domain.models.Recipe
import com.art.android.recipes.domain.models.RecipeDomain

/**
 * @author andhiratobing
 * @project Recipes
 */

object FakeDataSource {

    // Data dummy recipe
    val recipeDto = RecipeDto(
        id = 1,
        image = "https://spoonacular.com/recipeImages/716426-312x231.jpg",
        imageType = "jpg",
        title = "Cauliflower, Brown Rice, and Vegetable Fried Rice"
    )

    val recipe = Recipe(
        id = 1,
        image = "https://spoonacular.com/recipeImages/716426-312x231.jpg",
        imageType = "jpg",
        title = "Cauliflower, Brown Rice, and Vegetable Fried Rice"
    )

    // Data dummy recipes
    val recipesDto = listOf(
        RecipeDto(
            id = 1,
            image = "https://spoonacular.com/recipeImages/716426-312x231.jpg",
            imageType = "jpg",
            title = "Cauliflower, Cauliflower, Brown Rice, and Vegetable Fried Rice"
        ),
        RecipeDto(
            id = 2,
            image = "https://spoonacular.add test recipes modelscom/recipeImages/715594-312x231.jpg",
            imageType = "jpg",
            title = "Homemade Garlic and Basil French Fries"
        ),
        RecipeDto(
            id = 3,
            image = "https://spoonacular.com/recipeImages/715497-312x231.jpg",
            imageType = "jpg",
            title = "Berry Banana Breakfast Smoothie"
        ),
        RecipeDto(
            id = 4,
            image = "https://spoonacular.com/recipeImages/644387-312x231.jpg",
            imageType = "jpg",
            title = "Garlicky Kale"
        ),
        RecipeDto(
            id = 4,
            image = "https://spoonacular.com/recipeImages/716268-312x231.jpg",
            imageType = "jpg",
            title = "African Chicken Peanut Stew"
        ),
        RecipeDto(
            id = 5,
            image = "https://spoonacular.com/recipeImages/716381-312x231.jpg",
            imageType = "jpg",
            title = "Nigerian Snail Stew"
        ),
        RecipeDto(
            id = 6,
            image = "https://spoonacular.com/recipeImages/782601-312x231.jpg",
            imageType = "jpg",
            title = "Red Kidney Bean Jambalaya"
        ),
        RecipeDto(
            id = 7,
            image = "https://spoonacular.com/recipeImages/782601-312x231.jpg",
            imageType = "jpg",
            title = "Broccoli and Chickpea Rice Salad"
        ),
        RecipeDto(
            id = 8,
            image = "https://spoonacular.com/recipeImages/715446-312x231.jpg",
            imageType = "jpg",
            title = "Slow Cooker Beef Stew"
        ),
        RecipeDto(
            id = 9,
            image = "https://spoonacular.com/recipeImages/715415-312x231.jpg",
            imageType = "jpg",
            title = "Red Lentil Soup with Chicken and Turnips"
        )
    )

    // Data dummy recipes
    val recipes = listOf(
        Recipe(
            id = 1,
            image = "https://spoonacular.com/recipeImages/716426-312x231.jpg",
            imageType = "jpg",
            title = "Cauliflower, Cauliflower, Brown Rice, and Vegetable Fried Rice"
        ),
        Recipe(
            id = 2,
            image = "https://spoonacular.com/recipeImages/715594-312x231.jpg",
            imageType = "jpg",
            title = "Homemade Garlic and Basil French Fries"
        ),
        Recipe(
            id = 3,
            image = "https://spoonacular.com/recipeImages/715497-312x231.jpg",
            imageType = "jpg",
            title = "Berry Banana Breakfast Smoothie"
        ),
        Recipe(
            id = 4,
            image = "https://spoonacular.com/recipeImages/644387-312x231.jpg",
            imageType = "jpg",
            title = "Garlicky Kale"
        ),
        Recipe(
            id = 4,
            image = "https://spoonacular.com/recipeImages/716268-312x231.jpg",
            imageType = "jpg",
            title = "African Chicken Peanut Stew"
        ),
        Recipe(
            id = 5,
            image = "https://spoonacular.com/recipeImages/716381-312x231.jpg",
            imageType = "jpg",
            title = "Nigerian Snail Stew"
        ),
        Recipe(
            id = 6,
            image = "https://spoonacular.com/recipeImages/782601-312x231.jpg",
            imageType = "jpg",
            title = "Red Kidney Bean Jambalaya"
        ),
        Recipe(
            id = 7,
            image = "https://spoonacular.com/recipeImages/782601-312x231.jpg",
            imageType = "jpg",
            title = "Broccoli and Chickpea Rice Salad"
        ),
        Recipe(
            id = 8,
            image = "https://spoonacular.com/recipeImages/715446-312x231.jpg",
            imageType = "jpg",
            title = "Slow Cooker Beef Stew"
        ),
        Recipe(
            id = 9,
            image = "https://spoonacular.com/recipeImages/715415-312x231.jpg",
            imageType = "jpg",
            title = "Red Lentil Soup with Chicken and Turnips"
        )
    )
    val recipeResponse = RecipeResponse(
        number = 1,
        offset = 1,
        results = recipesDto,
        totalResults = 10
    )

    val recipeDomain = RecipeDomain(
        number = 1,
        offset = 1,
        results = recipes,
        totalResults = 10
    )
}
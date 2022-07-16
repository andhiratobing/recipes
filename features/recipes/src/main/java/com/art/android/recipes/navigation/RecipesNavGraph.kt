package com.art.android.recipes.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.art.android.navigation.utils.Route
import com.art.android.recipes.navigation.directions.RecipesNavDirection

/**
 * @author andhiratobing
 * @project RecipesRepository
 */

@ExperimentalMaterial3Api
fun NavGraphBuilder.recipesNavGraph(
    navController: NavController
) {
    navigation(
        route = Route.Recipe.route,
        startDestination = RecipesNavDirection.destination,
        builder = {
            RecipesNavDirection.screen(navGraphBuilder = this, navController = navController)
        }
    )
}
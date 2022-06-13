package com.art.android.recipes.navigation.directions

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.art.android.navigation.NavigationScreen
import com.art.android.recipes.ui.RecipesScreen

/**
 * @author andhiratobing
 * @project RecipesRepository
 */

object RecipesNavDirection : NavigationScreen {

    override val route: String
        get() = RecipesNavDirection::class.java.simpleName

    override val destination: String
        get() = route

    override fun screen(navGraphBuilder: NavGraphBuilder, navController: NavController) {
        navGraphBuilder.composable(
            route = route,
            content = {
                RecipesScreen()
            }
        )
    }
}
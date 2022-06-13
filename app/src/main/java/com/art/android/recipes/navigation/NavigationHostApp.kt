package com.art.android.recipes.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.art.android.navigation.utils.Route
import com.art.android.splash.navigation.splashNavGraph

/**
 * @author andhiratobing
 * @project RecipesRepository
 */

@Composable
fun NavigationHostApp(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = Route.Splash.route,
        builder = {
            // Splash nav graph
            splashNavGraph(navController = navController)

            // RecipesRepository nav graph
            recipesNavGraph(navController = navController)
        }
    )
}
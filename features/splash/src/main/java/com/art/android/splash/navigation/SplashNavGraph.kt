package com.art.android.splash.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.art.android.navigation.utils.Route
import com.art.android.splash.navigation.directions.SplashNavDirection

/**
 * @author andhiratobing
 * @project Recipes
 */

fun NavGraphBuilder.splashNavGraph(
    navController: NavController
) {
    // Define splash screen navigation
    navigation(
        route = Route.Splash.route,
        startDestination = SplashNavDirection.destination,
        builder = {
            SplashNavDirection.screen(
                navGraphBuilder = this,
                navController = navController
            )
        }
    )
}
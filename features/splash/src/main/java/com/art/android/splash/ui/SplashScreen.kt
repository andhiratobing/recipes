package com.art.android.splash.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import com.art.android.recipes.navigation.directions.RecipesNavDirection
import com.art.android.splash.navigation.directions.SplashNavDirection
import kotlinx.coroutines.delay

/**
 * @author andhiratobing
 * @project RecipesRepository
 */

@Composable
fun SplashScreen(
    navController: NavController
) {
    LaunchedEffect(key1 = Unit) {
        delay(3_000)
        navController.navigate(RecipesNavDirection.destination) {
            popUpTo(
                route = SplashNavDirection.route,
                popUpToBuilder = {
                    inclusive = true
                }
            )
        }
    }

    // Splash content
    SplashContent()
}
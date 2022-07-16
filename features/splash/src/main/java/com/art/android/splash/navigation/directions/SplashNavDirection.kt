package com.art.android.splash.navigation.directions

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.art.android.navigation.NavigationScreen
import com.art.android.splash.ui.SplashScreen

/**
 * @author andhiratobing
 * @project RecipesRepository
 */
@ExperimentalMaterial3Api
object SplashNavDirection : NavigationScreen {

    override val route: String
        get() = SplashNavDirection::class.java.simpleName

    override val destination: String
        get() = route

    override fun screen(navGraphBuilder: NavGraphBuilder, navController: NavController) {
        navGraphBuilder.composable(
            route = route,
            content = {
                SplashScreen(navController = navController)
            }
        )
    }
}
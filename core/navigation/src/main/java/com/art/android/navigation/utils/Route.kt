package com.art.android.navigation.utils

/**
 * @author andhiratobing
 * @project Recipes
 */

sealed class Route(val route: String) {

    object Splash : Route(Splash::class.java.simpleName)

    object Recipe: Route(Recipe::class.java.simpleName)
}
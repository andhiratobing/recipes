package com.art.android.navigation

import androidx.navigation.NavArgument
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder

/**
 * @author andhiratobing
 * @project Recipes
 */

interface NavigationScreen {

    /**
     * Defines a specific route this destination belongs to.
     * Route is a String that defines the path to your composable.
     * You can think of it as an implicit deep link that leads to a specific destination.
     * Each destination should have a unique route.
     */
    val route: String

    /**
     * Defines a specific destination ID.
     * This is needed when using nested graphs via the navigation DLS, to differentiate a specific
     * destination's route from the route of the entire nested graph it belongs to.
     */
    val destination: String

    // Specify param if in navigation need parameter
    val param: String? get() = null

    // Specify argument if in navigation need argument
    val arguments: List<NavArgument> get() = emptyList()

    // Defines all screens to be used
    fun screen(navGraphBuilder: NavGraphBuilder, navController: NavController)
}
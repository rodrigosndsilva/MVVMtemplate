package dev.pinkroom.mvvmtemplate.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import dev.pinkroom.mvvmtemplate.ui.homescreen.Homescreen

@Composable
fun SetupNavGraph(
    navController: NavHostController,
    startDestination: String,
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
    ) {
        composable(Screen.Homescreen.route) { Homescreen(navController) }
    }
}
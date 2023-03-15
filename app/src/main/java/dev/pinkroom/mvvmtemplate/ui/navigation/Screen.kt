package dev.pinkroom.mvvmtemplate.ui.navigation

sealed class Screen(val route: String) {
    object Homescreen : Screen("homescreen")
}
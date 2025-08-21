package com.example.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun DrawerNavHost(navController: NavHostController, modifier: Modifier = Modifier) {

    NavHost(
        navController = navController,
        startDestination = DrawerScreen.Home.route,
        modifier = modifier
    ) {
        composable(DrawerScreen.Home.route) {
            DrawerScreen("Home Screen")
        }
        composable(DrawerScreen.Profile.route) {
            DrawerScreen("Profile Screen")
        }
        composable(DrawerScreen.Settings.route) {
            DrawerScreen("Settings Screen")
        }
    }
}

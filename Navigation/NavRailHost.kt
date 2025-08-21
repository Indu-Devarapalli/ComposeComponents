package com.example.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavRailHost(navController: NavHostController) {
    NavHost(navController, startDestination = NavScreen.Home.route) {
        composable(NavScreen.Home.route) {
            RailScreen(screen = NavScreen.Home)
        }
        composable(NavScreen.Messages.route) {
            RailScreen(screen = NavScreen.Messages)
        }
        composable(NavScreen.Settings.route) {
            RailScreen(screen = NavScreen.Settings)
        }
    }
}
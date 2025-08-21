package com.example.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavScreen(val title: String, val icon: ImageVector, val route: String) {
    object Home : NavScreen("Home", Icons.Default.Home, "home")
    object Messages : NavScreen("Messages", Icons.Default.Email, "messages")
    object Settings : NavScreen("Settings", Icons.Default.Settings, "settings")
}

val screens = listOf(NavScreen.Home, NavScreen.Messages, NavScreen.Settings)

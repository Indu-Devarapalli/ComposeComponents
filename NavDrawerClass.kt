package com.example.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

// Represents each drawer item with its route, label, and icon
sealed class DrawerScreen(val route: String, val label: String, val icon: ImageVector) {
    object Home : DrawerScreen("home", "Home", Icons.Default.Home)
    object Profile : DrawerScreen("profile", "Profile", Icons.Default.Person)
    object Settings : DrawerScreen("settings", "Settings", Icons.Default.Settings)
}

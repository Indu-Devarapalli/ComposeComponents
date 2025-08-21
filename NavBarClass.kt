package com.example.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route: String, val icon: ImageVector, val label: String) {
    object Home : Screen("home", Icons.Default.Home, "Home")
    object Add : Screen("add", Icons.Default.Add, "Add") // will open bottom sheet
    object Profile : Screen("profile", Icons.Default.Person, "Profile")
}


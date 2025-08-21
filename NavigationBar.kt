package com.example.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState


@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)
@Composable
fun NavigationBar(navController: NavHostController) {
    val bottomSheetState = rememberModalBottomSheetState()

    var showSheet by remember { mutableStateOf(false) }

    val screens = listOf(Screen.Home, Screen.Add, Screen.Profile)
    val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route

    if (showSheet) {
        ModalBottomSheet(
            onDismissRequest = { showSheet = false },
            sheetState = bottomSheetState
        ) {
            // This is the content of the sheet
            Column(Modifier.padding(16.dp)) {
                Text("📸 Create Post")
                Spacer(Modifier.height(8.dp))
                Text("🎥 Go Live")
            }
        }
    }

    NavigationBar {
            screens.forEach { screen ->
                NavigationBarItem(
                    icon = { Icon(screen.icon, null) },
                    label = { Text(screen.label) },
                    selected = currentRoute == screen.route,
                    onClick = {
                        if (screen == Screen.Add) {
                            showSheet = true
                        } else {
                            navController.navigate(screen.route) {
                                launchSingleTop = true
                                popUpTo(navController.graph.startDestinationId) {
                                    saveState = true
                                }
                                restoreState = true
                            }
                        }
                    }
                )
            }
        }
    }



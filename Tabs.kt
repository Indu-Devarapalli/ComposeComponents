package com.example.codelabs2

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TabsApp() {
    // Titles of the tabs
    val tabTitles = listOf("Home", "Profile", "Settings")

    // Keeps track of the selected tab index
    var selectedTabIndex by remember { mutableStateOf(0) }

    Column(modifier = Modifier.fillMaxSize()) {

        // Top Tab Row
        TabRow(
            selectedTabIndex = selectedTabIndex,
            modifier = Modifier.fillMaxWidth(),
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            contentColor = MaterialTheme.colorScheme.onPrimaryContainer
        ) {
            tabTitles.forEachIndexed { index, title ->
                Tab(
                    selected = selectedTabIndex == index,
                    onClick = { selectedTabIndex = index },
                    text = { Text(text = title) }
                )
            }
        }

        // Tab content area
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            when (selectedTabIndex) {
                0 -> HomeTab()
                1 -> ProfileTab()
                2 -> SettingsTab()
            }
        }
    }
}

@Composable
fun HomeTab() {
    Text("Welcome to the Home Tab!", fontSize = 20.sp)
}

@Composable
fun ProfileTab() {
    Text("This is your Profile Tab.", fontSize = 20.sp)
}

@Composable
fun SettingsTab() {
    Text("Here are your Settings.", fontSize = 20.sp)
}

@Preview(showBackground = true)
@Composable
fun TabsAppPreview() {
    TabsApp()
}
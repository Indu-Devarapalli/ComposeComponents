package com.example.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun HomeScreen() = Box(Modifier.fillMaxSize()) { Text("🏠 Home Screen", Modifier.padding(16.dp)) }

@Preview
@Composable
fun ProfileScreen() = Box(Modifier.fillMaxSize()) { Text("👤 Profile Screen", Modifier.padding(16.dp)) }

package com.example.codelabs2

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
 fun LazyColumn() {
    val dataList = listOf("Abhishek", "Harshit", "Gaurav", "Avin")

    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp)
    ) {
        items(dataList) { item ->
            Text(
                text = item,
                fontSize = 20.sp,
                modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
            )
        }
    }
}



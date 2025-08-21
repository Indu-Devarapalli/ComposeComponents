package com.example.codelabs2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//Example1
@Preview
@Composable
fun SimpleBoxExample() {
    Box(
        modifier = Modifier
            .size(200.dp)
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hello from Box!",
            color = Color.Black,
            fontSize = 19.sp
        )
    }
}

//Example2 Layering Multiple Texts Inside a Box

@Preview
@Composable
fun LayeredTextsBox() {
    Box(
        modifier = Modifier
            .size(200.dp)
            .background(Color.Gray)
    ) {
        Text(
            text = "Text 1",
            fontSize = 20.sp,
            color = Color.White,
            modifier = Modifier.align(Alignment.TopStart)
        )
        Text(
            text = "Text 2",
            fontSize = 20.sp,
            color = Color.Yellow,
            modifier = Modifier.align(Alignment.Center)
        )
        Text(
            text = "Text 3",
            fontSize = 20.sp,
            color = Color.Cyan,
            modifier = Modifier.align(Alignment.BottomEnd)
        )
    }
}

//Example3 Adding Shapes (Circle and Rectangle) in a Box

@Preview
@Composable
fun ShapesInBox() {
    Box(
        modifier = Modifier
            .size(200.dp)
            .background(Color.LightGray)
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Red)
                .align(Alignment.TopStart)
        )

        Box(
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
                .background(Color.Blue)
                .align(Alignment.BottomEnd)
        )
    }
}

//Example4 Custom Positioning with Alignment

@Preview
@Composable
fun PositionedBoxContent() {
    Box(
        modifier = Modifier
            .size(200.dp)
            .background(Color.White)
    ) {
        Text(
            "Top Left",
            modifier = Modifier.align(Alignment.TopStart),
            color = Color.Black
        )
        Text(
            "Bottom Right",
            modifier = Modifier.align(Alignment.BottomEnd),
            color = Color.Red
        )
    }
}

//Example5 Combining Box with Row or Column

@Preview
@Composable
fun BoxWithColumn() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Line 1", fontSize = 18.sp)
            Text("Line 2", fontSize = 18.sp)
            Text("Line 3", fontSize = 18.sp)
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Line 1", fontSize = 18.sp)
            Text("Line 2", fontSize = 18.sp)
            Text("Line 3", fontSize = 18.sp)
        }
    }
}

//Example6 BoxWithConstraints

@Preview
@Composable
fun ResponsiveTextBox() {
    BoxWithConstraints(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        val textSize = if (maxWidth < 400.dp) 16.sp else 24.sp

        Text(
            text = "Responsive Text",
            fontSize = textSize,
            color = Color.Black
        )
    }
}


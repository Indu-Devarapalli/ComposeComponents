package com.example.codelabs2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout

@Preview
@Composable
fun ChainExample() {  //Place 3 boxes and distribute them evenly across the screen.
    ConstraintLayout(
        modifier = Modifier.fillMaxWidth().padding(16.dp)
    ) {
        val (box1, box2, box3) = createRefs()

        createHorizontalChain(box1, box2, box3, chainStyle = ChainStyle.Spread)

        Box(
            modifier = Modifier
                .size(50.dp)
                .background(Color.Red)
                .constrainAs(box1) {
                    top.linkTo(parent.top)
                }
        )
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(Color.Green)
                .constrainAs(box2) {
                    top.linkTo(parent.top)
                }
        )
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(Color.Blue)
                .constrainAs(box3) {
                    top.linkTo(parent.top)
                }
        )
    }
}

@Preview
@Composable
fun GuidelineExample() { //Position text 30% from the top using a guideline.
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val guideline = createGuidelineFromTop(0.3f) // 30% from top
        val text = createRef()

        Text(
            "Hello World",
            modifier = Modifier.constrainAs(text) {
                top.linkTo(guideline)
                start.linkTo(parent.start)
            }
        )
    }
}


@Preview
@Composable
fun BarrierExample() { //Align a Button to the end of the widest text dynamically.
    ConstraintLayout(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
        val (shortText, longText, btn) = createRefs()

        Text(
            "Short",
            modifier = Modifier.constrainAs(shortText) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            }
        )

        Text(
            "Much longer text",
            modifier = Modifier.constrainAs(longText) {
                top.linkTo(shortText.bottom, margin = 16.dp)
                start.linkTo(parent.start)
            }
        )

        // Barrier to the end of the longest text
        val endBarrier = createEndBarrier(shortText, longText)

        Button(
            onClick = {},
            modifier = Modifier.constrainAs(btn) {
                start.linkTo(endBarrier, margin = 8.dp)
                top.linkTo(longText.top)
            }
        ) {
            Text("Action")
        }
    }
}

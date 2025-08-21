package com.example.codelabs2

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout


@Preview
@Composable
fun StartEndTopBottomExample() { //Place Text B below and aligned to the start of Text A
    ConstraintLayout(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        val (textA, textB) = createRefs()

        Text(
            text = "Text A",
            modifier = Modifier.constrainAs(textA) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            }
        )

        Text(
            text = "Text B",
            modifier = Modifier.constrainAs(textB) {
                top.linkTo(textA.bottom, margin = 16.dp)
                start.linkTo(textA.start)
            }
        )
    }
}

@Preview
@Composable
fun BaselineExample() { //Align the text of two Texts so the first letters are aligned, even with different font sizes.
    ConstraintLayout(

        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        val (bigText, smallText) = createRefs()

        Text(
            text = "Big Text",
            fontSize = 24.sp,
            modifier = Modifier.constrainAs(bigText) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            }
        )

        Text(
            text = "Small Text",
            fontSize = 16.sp,
            modifier = Modifier.constrainAs(smallText) {
                baseline.linkTo(bigText.baseline) // Align baselines!
                start.linkTo(bigText.end, margin = 16.dp)
            }
        )
    }
}

@Preview
@Composable
fun CenterBetweenExample() {  //Place a Text in between two Buttons horizontally.
    ConstraintLayout(
        modifier = Modifier.fillMaxWidth().padding(16.dp)
    ) {
        val (startBtn, centerText, endBtn) = createRefs()

        Button(onClick = {}, modifier = Modifier.constrainAs(startBtn) {
            start.linkTo(parent.start)
            top.linkTo(parent.top)
        }) {
            Text("Left")
        }

        Button(onClick = {}, modifier = Modifier.constrainAs(endBtn) {
            end.linkTo(parent.end)
            top.linkTo(parent.top)
        }) {
            Text("Right")
        }

        Text("Centered", modifier = Modifier.constrainAs(centerText) {
            start.linkTo(startBtn.end)
            end.linkTo(endBtn.start)
            top.linkTo(startBtn.top)
        })
    }
}


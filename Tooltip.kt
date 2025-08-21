package com.example.codelabs2

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.PlainTooltip
import androidx.compose.material3.RichTooltip
import androidx.compose.material3.Text
import androidx.compose.material3.TooltipBox
import androidx.compose.material3.TooltipDefaults
import androidx.compose.material3.rememberTooltipState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

/*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlainTooltipExample(
    modifier: Modifier = Modifier,
    plainTooltipText: String = "Add to favorites"
) {
    TooltipBox(
        modifier = modifier,
        positionProvider = TooltipDefaults.rememberPlainTooltipPositionProvider(),
        tooltip = {
            PlainTooltip { Text(plainTooltipText) }
        },
        state = rememberTooltipState()
    ) {
        IconButton(onClick = { /* Do something... */ }) {
            Icon(
                imageVector = Icons.Filled.Favorite,
                contentDescription = "Add to favorites"
            )
        }
    }
}

@Preview
@Composable
fun PlainTooltipSamplePreview() {
    PlainTooltipExample()
}
 */


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RichTooltipExample(
    modifier: Modifier = Modifier,
    richTooltipSubheadText: String = "Rich Tooltip",
    richTooltipText: String = "Rich tooltips support multiple lines of informational text."
) {
    TooltipBox(
        modifier = modifier,
        positionProvider = TooltipDefaults.rememberRichTooltipPositionProvider(),
        tooltip = {
            RichTooltip(
                title = { Text(richTooltipSubheadText) }
            ) {
                Text(richTooltipText)
            }
        },
        state = rememberTooltipState()
    ) {
        IconButton(onClick = { /* Icon button's click event */ }) {
            Icon(
                imageVector = Icons.Filled.Info,
                contentDescription = "Show more information"
            )
        }
    }
}
@Preview
@Composable
 fun RichTooltipSamplePreview() {
    RichTooltipExample()
}
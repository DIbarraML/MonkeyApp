package com.example.monkeyapp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun MonkeyDivider(
    color: Color = Color.White,
    alignment: Alignment.Horizontal = Alignment.Start,
    top: Dp = 0.dp,
    start: Dp = 0.dp
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Divider(
            color = color,
            thickness = 1.dp,
            modifier = Modifier
                .width(80.dp)
                .padding(top = top, start = start)
                .align(alignment)
        )
    }

}

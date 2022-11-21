package com.example.monkeyapp.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun MonkeyTitle(
    textId: Int,
    color: Color = Color.White,
    textAlign: TextAlign
) {
    Text(
        text = stringResource(id = textId),
        style = MaterialTheme.typography.h1,
        modifier = Modifier
            .padding(top = 16.dp),
        color = color,
        textAlign = textAlign
    )
}
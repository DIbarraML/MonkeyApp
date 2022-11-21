package com.example.monkeyapp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun MonkeyButton(textId: Int, callback: () -> Unit) {
    Column() {
        Button(
            onClick = {
                callback.invoke()
            },
            shape = RoundedCornerShape(24.dp),
            modifier = Modifier
                .wrapContentWidth()
                .wrapContentHeight()
                .padding(top = 24.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.White,
                contentColor = Color.Cyan
            )
        ) {
            Text(
                text = stringResource(id = textId),
                style = MaterialTheme.typography.button
            )
        }
    }
}
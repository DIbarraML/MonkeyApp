package com.example.monkeyapp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun InfoLocation() {
    Column(
        horizontalAlignment = Alignment.End
    ) {
        Text(
            text = "Bogotá:",
            style = MaterialTheme.typography.subtitle1,
            modifier = Modifier.padding(top = 24.dp)
        )
        Text(text = "Calle 106 # 54-15 of. 307/308", style = MaterialTheme.typography.subtitle2)
        Text(
            text = "Harpenden, UK",
            style = MaterialTheme.typography.subtitle1,
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(text = "Harpenden Hall, Southdown Rd", style = MaterialTheme.typography.subtitle2)
        Text(
            text = "Miami, USA:",
            style = MaterialTheme.typography.subtitle1,
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(text = "990 Biscayne Blvd #501", style = MaterialTheme.typography.subtitle2)

    }
}
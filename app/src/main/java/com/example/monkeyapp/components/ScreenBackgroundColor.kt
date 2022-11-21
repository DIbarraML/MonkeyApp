package com.example.monkeyapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.monkeyapp.R

@Composable
fun ScreenBackgroundColor() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(750.dp)
                .background(colorResource(id = R.color.background_first_screen))
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(1000.dp)
                .background(colorResource(id = R.color.background_second_screen))
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(620.dp)
                .background(colorResource(id = R.color.background_third_screen))
        )
    }
}
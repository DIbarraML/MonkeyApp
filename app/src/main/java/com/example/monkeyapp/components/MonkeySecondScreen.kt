package com.example.monkeyapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.monkeyapp.R

@Composable
fun MonkeySecondScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 16.dp, end = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.case_studies),
            style = MaterialTheme.typography.h4,
            color = Color.White,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 40.dp)
        )

        MonkeyDivider(
            top = 8.dp,
            start = 40.dp,
        )

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.arrow_left),
                contentDescription = "lines Main",
                modifier = Modifier
                    .width(24.dp)
                    .height(24.dp)
                    .clickable { }
            )

            MonkeyCard()

            Image(
                painter = painterResource(id = R.drawable.arrow_right),
                contentDescription = "lines Main",
                modifier = Modifier
                    .width(24.dp)
                    .height(24.dp)
                    .clickable { }
            )
        }

        RowSelected()

    }
}
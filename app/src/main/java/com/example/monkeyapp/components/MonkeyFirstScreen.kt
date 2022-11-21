package com.example.monkeyapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.monkeyapp.sendEmail
import com.example.monkeyapp.ui.theme.CyanTextButton
import com.example.monkeyapp.R

@Composable
fun MonkeyFirstScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 16.dp, end = 16.dp, top = 56.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Image(
            painter = painterResource(id = R.drawable.foonkie_monkey_logo_one),
            contentDescription = "foonkie monkey",
            modifier = Modifier.width(104.dp),
            contentScale = ContentScale.Crop
        )

        MonkeyDivider(
            color = Color.Black,
            alignment = Alignment.CenterHorizontally,
            top = 40.dp
        )

        MonkeyTitle(
            textId = R.string.title_first_screen,
            textAlign = TextAlign.Center,
            color = Color.Black
        )

        Text(
            text = stringResource(id = R.string.we_are_samurais),
            modifier = Modifier
                .padding(top = 24.dp, start = 40.dp, end = 40.dp),
            style = MaterialTheme.typography.body1
        )

        val context = LocalContext.current
        MonkeyButton(R.string.get_in_touch) {
            sendEmail(context)
        }

        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                contentDescription = "foonkie monkey",
                modifier = Modifier
                    .width(256.dp)
                    .align(Alignment.Center),
                painter = painterResource(id = R.drawable.foonkie_monkey),
                contentScale = ContentScale.Fit,
            )

            Box(
                modifier = Modifier
                    .padding(bottom = 112.dp, end = 8.dp)
                    .width(64.dp)
                    .height(64.dp)
                    .background(Color.White, CircleShape)
                    .align(Alignment.BottomEnd)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.lines),
                    tint = CyanTextButton,
                    contentDescription = "lines Main",
                    modifier = Modifier
                        .width(24.dp)
                        .height(24.dp)
                        .align(Alignment.Center)
                        .clickable { }
                )
            }
        }


    }
}
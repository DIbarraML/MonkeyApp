package com.example.monkeyapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.monkeyapp.sendEmail
import com.example.monkeyapp.ui.theme.CyanTextButton
import com.example.monkeyapp.R

@Composable
fun FirstScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 16.dp, end = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Image(
            painter = painterResource(id = R.drawable.foonkie_monkey_logo_one),
            contentDescription = "foonkie monkey",
            modifier = Modifier.width(104.dp),
            contentScale = ContentScale.Crop
        )

        Divider(
            color = Color.Black,
            thickness = 1.dp,
            modifier = Modifier
                .width(80.dp)
                .padding(top = 40.dp)
        )

        Text(
            text = "Expert Samurais\n" +
                    "on Develop Secure apps\n" +
                    "with Sensitive data. ",
            style = MaterialTheme.typography.h1,
            modifier = Modifier
                .padding(top = 16.dp)
        )

        Text(
            text = "We are samurais code monkeys that masters the most recent data security protocols, encrypted methodologies and Blockchain development.",
            modifier = Modifier
                .padding(top = 24.dp, start = 40.dp, end = 40.dp),
            style = MaterialTheme.typography.body1
        )

        val context = LocalContext.current
        Button(
            onClick = {

                sendEmail(context)
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
                text = "Get in Touch!",
                style = MaterialTheme.typography.button
            )
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
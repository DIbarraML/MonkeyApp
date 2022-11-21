package com.example.monkeyapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.monkeyapp.R
import com.example.monkeyapp.utils.sendEmail

@Composable
fun MonkeyThirdScreen() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 48.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.foonkie_monkey_call),
            modifier = Modifier
                .fillMaxWidth()
                .height(336.dp)
                .padding(end = 136.dp),
            contentDescription = "foonkie monkey",
            contentScale = ContentScale.Crop,
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 120.dp, end = 32.dp),
            horizontalAlignment = Alignment.End
        ) {

            MonkeyTitle(
                textId = R.string.lets_work,
                textAlign = TextAlign.End
            )

            val context = LocalContext.current

            MonkeyButton(R.string.get_in_touch) {
                sendEmail(context = context)
            }

            MonkeyDivider(
                top = 56.dp,
                alignment = Alignment.End
            )

            Image(
                painter = painterResource(id = R.drawable.foonkie_monkey_logo_one),
                contentDescription = "foonkie monkey",
                modifier = Modifier.width(124.dp),
                contentScale = ContentScale.Crop
            )

            InfoLocation()

            MonkeyDivider(
                top = 24.dp,
                alignment = Alignment.End
            )

            Text(
                text = stringResource(id = R.string.foonkie_monkey_2021),
                style = MaterialTheme.typography.subtitle2,
                modifier = Modifier.padding(top = 24.dp)
            )
        }
    }
}
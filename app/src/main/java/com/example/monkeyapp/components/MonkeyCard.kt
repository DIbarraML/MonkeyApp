package com.example.monkeyapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.monkeyapp.R

@Composable
fun MonkeyCard() {
    Column() {
        Card(
            modifier = Modifier
                .width(300.dp)
                .padding(top = 24.dp, start = 12.dp, end = 12.dp, bottom = 24.dp)
                .wrapContentHeight()
                //.padding(start = 40.dp, end = 40.dp)
                .align(Alignment.Start),
            elevation = 12.dp,
            backgroundColor = colorResource(id = R.color.background_card)
        ) {

            Column() {
                Image(
                    painter = painterResource(id = R.drawable.pfizer_cell),
                    contentDescription = "Images cell"
                )

                Column(
                    modifier = Modifier
                        .padding(start = 28.dp, end = 28.dp, top = 16.dp)
                ) {

                    MonkeyTitle(
                        textId = R.string.digital_platform,
                        textAlign = TextAlign.Start,
                        color = Color.Black
                    )

                    MonkeyDivider(
                        color = Color.Black,
                        top = 16.dp
                    )

                    Text(
                        text = stringResource(id = R.string.give_the_hability),
                        style = MaterialTheme.typography.body2,
                        modifier = Modifier.padding(top = 16.dp)
                    )

                    Button(
                        onClick = { /*TODO*/ },
                        shape = RoundedCornerShape(24.dp),
                        modifier = Modifier
                            .wrapContentWidth()
                            .wrapContentHeight()
                            .padding(top = 24.dp, bottom = 24.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
                    ) {
                        Text(
                            text = stringResource(id = R.string.view_project),
                            style = MaterialTheme.typography.button
                        )
                    }
                }
            }
        }
    }
}
package com.example.monkeyapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import com.example.monkeyapp.components.InfoLocation
import com.example.monkeyapp.components.MonkeyDivider
import com.example.monkeyapp.components.MonkeyTitle
import com.example.monkeyapp.components.ScreenBackgroundColor
import com.example.monkeyapp.ui.theme.CyanTextButton
import com.example.monkeyapp.ui.theme.MonkeyAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MonkeyAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .verticalScroll(rememberScrollState())
                    ) {
                        ScreenBackgroundColor()
                        Column(modifier = Modifier.fillMaxSize()) {
                            FirstScreen()
                            SecondScreen()
                            ThirdScreen()
                        }
                    }

                }
            }
        }
    }
}

@Composable
fun FirstScreen() {
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
                text = stringResource(id = R.string.get_in_touch),
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

@Composable
fun SecondScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 16.dp, end = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
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

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp)
                .wrapContentHeight()
                .padding(start = 40.dp, end = 40.dp)
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
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = stringResource(id = R.string.pfizer),
                style = MaterialTheme.typography.h3,
                modifier = Modifier
                    .clickable { }
                    .drawWithContent {
                        drawContent()
                        clipRect { // Not needed if you do not care about painting half stroke outside
                            val strokeWidth = Stroke.DefaultMiter
                            val y = 0f // - strokeWidth
                            // if the whole line should be inside component
                            drawLine(
                                brush = SolidColor(Color.Black),
                                strokeWidth = strokeWidth,
                                cap = StrokeCap.Square,
                                start = Offset.Zero.copy(y = y),
                                end = Offset(x = size.width, y = y)
                            )
                        }
                    }
                    .padding(top = 8.dp)
            )
            Text(
                text = stringResource(id = R.string.takeda),
                style = MaterialTheme.typography.h5,
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = stringResource(id = R.string.boston),
                style = MaterialTheme.typography.h5,
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = stringResource(id = R.string.bsji),
                style = MaterialTheme.typography.h5,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }


}

@Composable
fun ThirdScreen() {

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

            Button(
                onClick = {
                    sendEmail(context = context)
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
                    text = stringResource(id = R.string.get_in_touch),
                    style = MaterialTheme.typography.button
                )
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

fun sendEmail(context: Context) {
    val intent = Intent(Intent.ACTION_SENDTO)
    intent.type = "text/plain"
    intent.putExtra(Intent.EXTRA_EMAIL,
         arrayOf("danielibarra0129@gmail.com"))
    intent.putExtra(Intent.EXTRA_SUBJECT, "I want a quote")
    intent.putExtra(Intent.EXTRA_TEXT, "I need you to build an application")

    startActivity(
        context,
        intent,
    null)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MonkeyAppTheme {
        FirstScreen()
        //BoxPrueba()
        /*Image(
        painter = painterResource(id = R.drawable.foonkie_monkey),
        contentDescription = "foonkie monkey",
        modifier = Modifier.fillMaxSize().height(2000.dp),
        contentScale = ContentScale.FillWidth
    )*/
    }
}

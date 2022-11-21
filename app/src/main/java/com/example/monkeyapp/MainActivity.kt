package com.example.monkeyapp

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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
                        PaintBackground()
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
fun PaintBackground() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(704.dp)
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
                .height(576.dp)
                .background(colorResource(id = R.color.background_third_screen))
        )
    }

}

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

        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(24.dp),
            modifier = Modifier
                .wrapContentWidth()
                .wrapContentHeight()
                .padding(top = 24.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
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
                        .align(Alignment.Center),
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
            text = "Case studies",
            style = MaterialTheme.typography.h4,
            color = Color.White,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 40.dp)
        )

        Divider(
            color = Color.White,
            thickness = 1.dp,
            modifier = Modifier
                .width(80.dp)
                .padding(top = 8.dp, start = 40.dp)
                .align(Alignment.Start)
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
                    Text(
                        text = "Digital Platform for Pfizer",
                        style = MaterialTheme.typography.h1,
                        modifier = Modifier
                            .padding(top = 16.dp),
                        color = Color.Black,
                        textAlign = TextAlign.Start
                    )

                    Divider(
                        color = Color.Black,
                        thickness = 1.dp,
                        modifier = Modifier
                            .width(80.dp)
                            .padding(top = 16.dp)
                            .align(Alignment.Start)
                    )

                    Text(
                        text = "We are samurais code monkeys that masters the most recent data security protocols, encrypted methodologies and Blockchain development.",
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
                            text = "View Project",
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
                text = "Pfizer",
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
                text = "Takeda",
                style = MaterialTheme.typography.h5,
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = "Boston Scientific\nGroup",
                style = MaterialTheme.typography.h5,
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = "BSJI",
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
            Text(
                text = "Let’s work\ntogether!",
                style = MaterialTheme.typography.h1,
                modifier = Modifier
                    .padding(top = 16.dp)
            )

            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(24.dp),
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight()
                    .padding(top = 24.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
            ) {
                Text(
                    text = "Get in Touch!",
                    style = MaterialTheme.typography.button
                )
            }

            Divider(
                color = Color.White,
                thickness = 1.dp,
                modifier = Modifier
                    .width(80.dp)
                    .padding(top = 56.dp, start = 40.dp)
                    .align(Alignment.End)
            )

            Image(
                painter = painterResource(id = R.drawable.foonkie_monkey_logo_one),
                contentDescription = "foonkie monkey",
                modifier = Modifier.width(124.dp),
                contentScale = ContentScale.Crop
            )

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

            Divider(
                color = Color.White,
                thickness = 1.dp,
                modifier = Modifier
                    .width(80.dp)
                    .padding(top = 24.dp)
                    .align(Alignment.End)
            )

            Text(
                text = "Foonkie Monkey 2021",
                style = MaterialTheme.typography.subtitle2,
                modifier = Modifier.padding(top = 24.dp)
            )


        }
    }


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

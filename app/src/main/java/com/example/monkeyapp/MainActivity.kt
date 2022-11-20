package com.example.monkeyapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .verticalScroll(rememberScrollState())
                    ) {
                        FirstScreen()
                        SecondScreen()
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
            .background(colorResource(id = R.color.background_first_screen))
            .fillMaxSize()
            .padding(16.dp),
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
            Text(text = "Get in Touch!",
                style = MaterialTheme.typography.button
            )
        }

        Box() {
            Image(
                painter = painterResource(id = R.drawable.foonkie_monkey),
                contentDescription = "foonkie monkey",
                modifier = Modifier.fillMaxSize().background(Color.Green),
                contentScale = ContentScale.Crop,
            )

            Box(modifier = Modifier
                .width(100.dp)
                .height(100.dp)
                .background(Color.Red)
                .align(Alignment.CenterEnd)

            ) {

            }

           /* Box() {

                Image(
                    painter = painterResource(id = R.drawable.foonkie_monkey),
                    contentDescription = "foonkie monkey",
                    modifier = Modifier.width(100.dp).height(100.dp),
                    contentScale = ContentScale.Crop
                )

                Image(
                painter = painterResource(id = R.drawable.foonkie_monkey),
                contentDescription = "foonkie monkey",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )

            }*/

        }


    }



}

@Composable
fun SecondScreen() {
    Column(
        modifier = Modifier
            .background(colorResource(id = R.color.background_second_screen))
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Expert Samurais\n" +
                    "on Develop Secure apps\n" +
                    "with Sensitive data. ",
            style = MaterialTheme.typography.h1,
            modifier = Modifier
                .padding(top = 16.dp)
        )
    }
}

@Composable
fun BoxPrueba() {
    Box(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.background(Color.Red).width(100.dp).height(100.dp).padding(200.dp).align(Alignment.CenterEnd).padding(200.dp)) {
            
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
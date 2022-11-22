package com.example.monkeyapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.transform.CircleCropTransformation
import com.example.monkeyapp.ui.theme.MonkeyAppTheme

class UserActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MonkeyAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                    //ItemList()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    LazyColumn {
        items(10) {
            ItemList()
        }
    }


}

@Composable
fun ItemList() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .border(width = 1.dp, Color.Black),
            horizontalArrangement = Arrangement.SpaceEvenly,

            ) {
            Text(
                text = "name", style = MaterialTheme.typography.h3,
                modifier = Modifier.align(Alignment.CenterVertically)
            )
            Text(
                text = "email", style = MaterialTheme.typography.h3,
                modifier = Modifier.align(Alignment.CenterVertically)
            )

            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data("https://reqres.in/img/faces/1-image.jpg")
                    .transformations(CircleCropTransformation())
                    .build(),
                contentDescription = "",
                modifier = Modifier.align(CenterVertically)
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    MonkeyAppTheme {
        //Greeting("Android")

    }
}
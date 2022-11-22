package com.example.monkeyapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.transform.CircleCropTransformation
import com.example.monkeyapp.data.model.User
import com.example.monkeyapp.ui.theme.MonkeyAppTheme


class UserDetailActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MonkeyAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val user = intent.extras?.get("user") as User
                    UserInfo(user = user)
                }
            }
        }
    }
}

@Composable
fun UserInfo(user: User) {
    val photo = remember {
        mutableStateOf(user.avatar)
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        horizontalAlignment = CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(photo.value)
                .transformations(CircleCropTransformation())
                .build(),
            contentDescription = "",
            modifier = Modifier
                .width(200.dp)
                .padding(start = 8.dp, end = 8.dp)
                .clickable {
                }
        )

        Text(
            text = user.firstName + " " + user.lastName,
            style = MaterialTheme.typography.h2,
            textAlign = TextAlign.Center
        )

        Text(
            text = user.email,
            style = MaterialTheme.typography.h3,
            textAlign = TextAlign.Center
        )
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    MonkeyAppTheme {
    }
}
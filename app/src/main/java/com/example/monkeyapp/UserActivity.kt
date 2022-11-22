package com.example.monkeyapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.transform.CircleCropTransformation
import com.example.monkeyapp.data.model.DataResponse
import com.example.monkeyapp.data.model.User
import com.example.monkeyapp.presentation.MonkeyViewModel
import com.example.monkeyapp.presentation.MonkeyViewModelFactory
import com.example.monkeyapp.ui.theme.MonkeyAppTheme

class UserActivity : ComponentActivity() {

    private val viewModel: MonkeyViewModel by viewModels {
        MonkeyViewModelFactory(application = application)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            viewModel.getUsers(1)
            viewModel.getUsers(2)

            MonkeyAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column {
                        ItemListHead()
                        ShowList()
                    }

                }
            }
        }
    }

    @Composable
    fun ShowList() {
        LazyColumn {
            items(viewModel.userListAct) { user ->
                ItemList(user)
            }
        }
    }
}


@Composable
fun ItemList(user: User) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .border(width = 1.dp, Color.Black),
            horizontalArrangement = Arrangement.SpaceEvenly

        ) {
            Text(
                text = user.firstName + user.lastName, style = MaterialTheme.typography.h3,
                modifier = Modifier
                    .weight(0.8f)
                    .padding(start = 8.dp, end = 8.dp)
                    .align(CenterVertically)
            )
            Text(
                text = user.email, style = MaterialTheme.typography.h3,
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 8.dp, end = 8.dp)
                    .align(CenterVertically)
            )

            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(user.avatar)
                    .transformations(CircleCropTransformation())
                    .build(),
                contentDescription = "",
                modifier = Modifier
                    .weight(0.5f)
                    .padding(start = 8.dp, end = 8.dp)
                    .align(CenterVertically),
            )
        }
    }

}

@Composable
fun ItemListHead() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .border(width = 0.1.dp, Color.Black),
            horizontalArrangement = Arrangement.SpaceEvenly,

            ) {
            Text(
                text = "NAME", style = MaterialTheme.typography.h3,
                modifier = Modifier
                    .align(CenterVertically)
                    .weight(1f)
            )
            Text(
                text = "EMAIL", style = MaterialTheme.typography.h3,
                modifier = Modifier
                    .align(CenterVertically)
                    .weight(1f)
            )

            Text(
                text = "PHOTO", style = MaterialTheme.typography.h3,
                modifier = Modifier
                    .align(CenterVertically)
                    .weight(1f)
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
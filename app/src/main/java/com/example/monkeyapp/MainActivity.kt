package com.example.monkeyapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.monkeyapp.presentation.MonkeyViewModel
import com.example.monkeyapp.presentation.MonkeyViewModelFactory
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
                    FirstScreen()
                }
            }
        }
    }

    @Composable
    fun FirstScreen() {
        val viewModel: MonkeyViewModel by viewModels {
            MonkeyViewModelFactory(application = application)
        }
        viewModel.getUsers(1)
        Text(text = "Expert Samurais\n" +
                "on Develop Secure apps\n" +
                "with Sensitive data. ")
    }
}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MonkeyAppTheme {
    }
}
package com.example.monkeyapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.monkeyapp.components.*
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
                        Box {
                            val intent = Intent(LocalContext.current, UserActivity::class.java)
                            MonkeyButton(textId = R.string.show_list) {
                                startActivity(intent)
                            }
                        }

                        Column(modifier = Modifier.fillMaxSize()) {
                            MonkeyFirstScreen()
                            MonkeySecondScreen()
                            MonkeyThirdScreen()
                        }
                    }

                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MonkeyAppTheme {
    }
}

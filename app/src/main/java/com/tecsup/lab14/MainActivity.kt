package com.tecsup.lab14

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.tecsup.lab14.ui.theme.LAB14Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LAB14Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainGreeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MainGreeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "¡Bienvenido a la vista principal, $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun MainGreetingPreview() {
    LAB14Theme {
        MainGreeting("Android")
    }
}

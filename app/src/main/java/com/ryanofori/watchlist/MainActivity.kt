package com.ryanofori.watchlist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ryanofori.watchlist.ui.theme.WatchlistTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WatchlistTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScaffold()
                }
            }
        }
    }
}

@Composable
fun MainScaffold() {
    Text("Hello")
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WatchlistTheme {
        MainScaffold()
    }
}
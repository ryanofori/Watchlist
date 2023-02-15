package com.ryanofori.watchlist

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ryanofori.watchlist.ui.theme.WatchlistTheme

class SettingsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WatchlistTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScaffold2()
                }
            }
        }
    }
}

@Composable
fun MainScaffold2() {
    val context = LocalContext.current
    Column {
        TopAppBar(
            elevation = 4.dp,
            title = {Text("Settings")},
            backgroundColor = MaterialTheme.colors.primary,
            navigationIcon = {
                IconButton(onClick = {
                    context.startActivity(Intent(context, MainActivity::class.java))
                }) {
                    Icon(Icons.Default.ArrowBack, null)
                }
            }
        )
        Text("Hello")
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    WatchlistTheme {
        MainScaffold2()
    }
}
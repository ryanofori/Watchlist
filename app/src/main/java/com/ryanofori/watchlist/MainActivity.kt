package com.ryanofori.watchlist

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ryanofori.watchlist.ui.theme.WatchItem
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
    val context = LocalContext.current
    Column {
        TopAppBar(
            elevation = 4.dp,
            title = {Text(stringResource(id = R.string.app_name))},
            backgroundColor = MaterialTheme.colors.primary,
            navigationIcon = {},
            actions = {
                IconButton(onClick = {
                    context.startActivity(Intent(context, SettingsActivity::class.java))
                }) {
                    Icon(Icons.Default.Settings, null)
                }
            }
        )
        ItemList()
    }

}

@Composable
fun ItemList() {
    var items by remember {
        mutableStateOf(
            (1..20).map {
                WatchItem(title = "Item $it", isSelected = false)
            }
        )
    }
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(items.size) {i ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {

                    }
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(items[i].title)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WatchlistTheme {
        MainScaffold()
    }
}
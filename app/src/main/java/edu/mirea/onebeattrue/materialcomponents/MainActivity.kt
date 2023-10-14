package edu.mirea.onebeattrue.materialcomponents

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                Test()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun Test() {
    ModalNavigationDrawer(drawerContent = {
        Column(
            Modifier
                .background(Color.White)
                .fillMaxHeight()
                .width(128.dp)
        ) {
            Text(text = "item 1")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "item 2")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "item 3")
        }
    }) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(text = "Top App Bar Title") },
                    navigationIcon = {
                        IconButton(onClick = {}) {
                            Icon(Icons.Rounded.Menu, contentDescription = null)
                        }
                    }
                )
            },
            bottomBar = {
                NavigationBar {
                    val items = listOf("item 1", "item 2", "item 3")

                    NavigationBarItem(
                        icon = { Icon(Icons.Rounded.Favorite, contentDescription = null) },
                        label = { Text(items[0]) },
                        selected = true,
                        onClick = {}
                    )

                    NavigationBarItem(
                        icon = { Icon(Icons.Rounded.Favorite, contentDescription = null) },
                        label = { Text(items[0]) },
                        selected = false,
                        onClick = {}
                    )

                    NavigationBarItem(
                        icon = { Icon(Icons.Rounded.Favorite, contentDescription = null) },
                        label = { Text(items[0]) },
                        selected = false,
                        onClick = {}
                    )
                }
            }
        ) {
            Text(
                text = "This is Scaffold content",
                modifier = Modifier.padding(it)
            )
        }
    }
}
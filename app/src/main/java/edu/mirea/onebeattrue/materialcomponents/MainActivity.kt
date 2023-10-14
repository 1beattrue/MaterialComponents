package edu.mirea.onebeattrue.materialcomponents

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import edu.mirea.onebeattrue.materialcomponents.ui.theme.MaterialComponentsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text(
                // modifier = Modifier.weight(1f), метод не доступен, поскольку он расширяется в ColumnScope Modifier.weight()
                text = "Text"
            )
            Column {
                Text(
                    modifier = Modifier.weight(1f),
                    text = "Text"
                )
            }
        }
    }
}


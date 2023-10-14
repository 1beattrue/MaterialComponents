package edu.mirea.onebeattrue.materialcomponents

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                TestText(text = "text", count = 5)
            }
        }
    }
}

@Composable
private fun ColumnScope.TestText(
    text: String,
    count: Int
) {
    repeat(count) {
        Text(
            modifier = Modifier.weight(1f),
            text = text
        )
    }
}
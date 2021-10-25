package com.example.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.composedemo.ui.theme.ComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting("Android")
        }
        testFunction(7)
        {
            testFun()
        }
    }
}


fun testFunction(valeu:Int,testFun:() -> Unit)
{
    testFun.invoke()
}
fun testFun()
{
    println("Test")
}

@Composable
fun Greeting(name: String) {
    Column() {
        Text(text = "Hello World $name!",
            color = Color.Blue,
            fontWeight = FontWeight.Bold
        )
        Text(text = "Hello World $name!",
            color = Color.Blue,
            fontWeight = FontWeight.Bold
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Greeting("Android")
}
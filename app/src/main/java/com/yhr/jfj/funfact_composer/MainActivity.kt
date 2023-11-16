package com.yhr.jfj.funfact_composer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.yhr.jfj.funfact_composer.ui.screens.FunFaceNavigationGraph
import com.yhr.jfj.funfact_composer.ui.theme.FunFact_ComposerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FunFact_ComposerTheme {
                FunFaceApp()
            }
        }
    }
}

@Composable
fun FunFaceApp() {
    FunFaceNavigationGraph()
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FunFact_ComposerTheme {
        FunFaceApp()
    }
}
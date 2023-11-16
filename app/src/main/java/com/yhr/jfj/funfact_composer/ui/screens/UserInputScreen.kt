package com.yhr.jfj.funfact_composer.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserInputScreen(navController: NavHostController) {
    Scaffold(modifier = Modifier
        .fillMaxSize()
        .clickable {
            navController.navigate(Routes.WELCOME_SCREEN)
        }) {
        Text(text = Routes.USER_INPUT_SCREEN)
    }
}

@Preview
@Composable
fun UserInputScreenPreview() {
    UserInputScreen(rememberNavController())
}
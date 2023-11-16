package com.yhr.jfj.funfact_composer.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun FunFaceNavigationGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.USER_INPUT_SCREEN) {
        composable(Routes.USER_INPUT_SCREEN) {
            UserInputScreen(navController)
        }
        composable(Routes.WELCOME_SCREEN) {
            WelcomeScreen()
        }
    }
}
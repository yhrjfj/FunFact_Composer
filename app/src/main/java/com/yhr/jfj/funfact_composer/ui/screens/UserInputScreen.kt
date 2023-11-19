package com.yhr.jfj.funfact_composer.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.yhr.jfj.funfact_composer.data.UserDataUiEvents
import com.yhr.jfj.funfact_composer.ui.TextComponent
import com.yhr.jfj.funfact_composer.ui.TextFieldComponent
import com.yhr.jfj.funfact_composer.ui.TopBar
import com.yhr.jfj.funfact_composer.ui.UserInputViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserInputScreen(userInputViewModel: UserInputViewModel) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            TopBar("Hey there \uD83D\uDE0A")

            TextComponent(
                textValue = "Let's learn about you",
                textSize = 24.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            TextComponent(
                textValue = "This app will prepare a details page based on your input provided by you !",
                textSize = 18.sp
            )

            Spacer(modifier = Modifier.height(60.dp))

            // Enter name
            TextComponent(textValue = "Name", textSize = 18.sp)
            Spacer(modifier = Modifier.height(10.dp))
            TextFieldComponent(onTextChange = {
                userInputViewModel.onEvent(
                    UserDataUiEvents.UserNameEntered(it)
                )
            })
        }
    }
}

@Preview
@Composable
fun UserInputScreenPreview() {
    UserInputScreen(UserInputViewModel())
}
package com.yhr.jfj.funfact_composer.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yhr.jfj.funfact_composer.R

// TopBar
@Composable
fun TopBar(value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = value,
            color = Color.Black,
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium
        )
        Spacer(modifier = Modifier.weight(1f))
        Image(
            painter = painterResource(id = R.drawable.yhrjfj),
            contentDescription = "YHRJFJ",
            modifier = Modifier.size(100.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    TopBar("")
}

// Text
@Composable
fun TextComponent(
    textValue: String,
    textSize: TextUnit,
    colorValue: Color = Color.Black
) {
    Text(
        text = textValue,
        fontSize = textSize,
        color = colorValue,
        fontWeight = FontWeight.Light
    )
}

@Preview(showBackground = true)
@Composable
fun TextComponentPreview() {
    TextComponent(textValue = "Shadow Light", textSize = 18.sp)
}

// Text Field
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldComponent(onTextChange: (name: String) -> Unit) {
    var currentValue by remember {
        mutableStateOf("")
    }

    val localFocusManager = LocalFocusManager.current

    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = currentValue,
        onValueChange = {
            currentValue = it
            onTextChange(it)
        },
        placeholder = {
            Text(
                text = "Enter your name",
                fontSize = 18.sp
            )
        },
        textStyle = TextStyle.Default.copy(
            fontSize = 24.sp
        ),
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Done
        ),
        keyboardActions = KeyboardActions {
            localFocusManager.clearFocus()
        }
    )
}

@Preview(showBackground = true)
@Composable
fun TextFieldComponentPreview() {
    TextFieldComponent(onTextChange = {})
}

// Component for add image
@Composable
fun AnimalCard(image: Int) {
    Card(
        modifier = Modifier
            .padding(24.dp)
            .size(130.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Image(
            modifier = Modifier
                .padding(16.dp)
                .wrapContentHeight()
                .wrapContentHeight(),
            painter = painterResource(id = image),
            contentDescription = "Animal Picture"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AnimalCardPreview() {
    AnimalCard(image = R.drawable.cat)
}
























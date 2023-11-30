

package com.example.appadvogados.presentation
import android.graphics.Paint.Align
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.appadvogados.ui.theme.Purple40

@Composable
fun RegisterScreen(nav: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Cadastrar-se como",
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth() .padding(top = 120.dp), fontSize = 30.sp
        )
        CustomRadio(text = "Advogado")

    }


}

@Preview
@Composable
fun RegisterScreenPreview() {
RegisterScreen(nav = rememberNavController())
}

@Composable
fun CustomRadio(text: String) {
    var selectedOption by remember {
        mutableStateOf("")
    }
    val onSelectionChange = { text: String ->
        selectedOption = text
    }
    var teste: Color

        Text(
            text = text,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .clip(
                    shape = RoundedCornerShape(
                        size = 12.dp,
                    ),
                )
                .border(
                    if (text == selectedOption) {
                        BorderStroke(2.dp, Purple40)
                    } else {
                        BorderStroke(2.dp, Color.Gray)
                    },
                    RoundedCornerShape(12.dp)
                )
                .clickable {
                    onSelectionChange(text)
                }
                .background(
                    if (text == selectedOption) {
                        teste = Color.White
                        Purple40
                    } else {
                        teste = Color.Gray
                        Color.White
                    }
                )
                .padding(
                    vertical = 12.dp,
                    horizontal = 16.dp,
                )
                .fillMaxWidth(),
            color = teste
        )
    }
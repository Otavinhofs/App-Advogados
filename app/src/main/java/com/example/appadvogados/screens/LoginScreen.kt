package com.example.appadvogados.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appadvogados.R
import com.example.appadvogados.ui.theme.Purple40

@Composable
fun LoginScreen() {
    Image(
        painter = painterResource(id = R.drawable.teste),
        contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.fillMaxSize()
    )
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
        ) {

        AppTitleLoginScreen()

        LoginForm()

        PrimaryButton(
            text = "Acessar",
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 65.dp, start = 65.dp, top = 15.dp)
                .height(50.dp),
            onClick = { /*TODO*/ }
        )

        SecondaryButton(
            text = "Cadastrar",
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 65.dp, start = 65.dp, top = 15.dp)
                .height(50.dp),
            onClick = { /*TODO*/ }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}


@Composable
fun AppTitleLoginScreen() {

    Column(modifier = Modifier.padding(top = 150.dp)) {
        Text(text = "NomedoAPP", fontSize = 30.sp)
        Text(text = "Profissionais",
            fontSize = 15.sp,
            textAlign = TextAlign.End,
            modifier = Modifier.align(Alignment.End))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldComposable(
    placeHolder: String,
    modifier: Modifier,
    text: String,
    onChangeValue: (String) -> Unit,
    keyboardType:KeyboardType = KeyboardType.Text)
{
    OutlinedTextField(
        modifier = modifier,
        value = text,
        onValueChange = onChangeValue,
        placeholder = { Text(text = placeHolder)},
        colors = TextFieldDefaults
            .textFieldColors(containerColor = Color.White),
        keyboardOptions = KeyboardOptions(
            keyboardType = keyboardType
        )
    )
}

@Composable
fun LoginForm() {
    Column {
        TextFieldComposable(
            placeHolder = "Email",
            Modifier.padding(top = 150.dp),
            text = "",
            onChangeValue = {}
        )
        TextFieldComposable(
            placeHolder = "Senha",
            Modifier.padding(top = 20.dp),
            text = "",
            onChangeValue = {}
        )
        Text(
            text = "Esqueceu a senha?",
            color = Purple40,
            fontSize = 13.sp,
            modifier = Modifier
                .align(Alignment.End)
                .padding(top = 15.dp)
        )
    }
}

@Composable
fun PrimaryButton(
    text: String,
    modifier: Modifier,
    onClick: () -> Unit,

) {
    Button(
        onClick = { onClick},
        modifier = modifier,
        colors = ButtonDefaults
            .buttonColors(Purple40)
    ) {
        Text(text = text, color = Color.White, fontSize = 20.sp)
    }
}

@Composable
fun SecondaryButton(
    text: String,
    modifier: Modifier,
    onClick: () -> Unit
) {
    androidx.compose.material3.OutlinedButton(
        onClick =  onClick ,
        modifier = modifier,
        border = BorderStroke(3.dp, Purple40),
        colors = ButtonDefaults.outlinedButtonColors(containerColor = Color.White)
    ) {
        Text(text = text, color = Purple40, fontSize = 20.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun PrimaryButtonPreview() {
    PrimaryButton(text = "Acessar", Modifier.padding(horizontal = 30.dp), onClick = {})
}

@Preview
@Composable
fun SecondaryButtonpreview() {
    SecondaryButton(
        text = "Cadastrar",
        modifier = Modifier.padding(horizontal = 30.dp),
        onClick = {}
    )
}
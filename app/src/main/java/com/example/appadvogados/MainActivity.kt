package com.example.appadvogados

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.appadvogados.Navigation.MainNav
import com.example.appadvogados.presentation.login.LoginScreen
import com.example.appadvogados.ui.theme.AppAdvogadosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppAdvogadosTheme {
                // A surface container using the 'background' color from the theme
                window.statusBarColor = getColor(R.color.black)
                MainNav()
            }
        }
    }
}
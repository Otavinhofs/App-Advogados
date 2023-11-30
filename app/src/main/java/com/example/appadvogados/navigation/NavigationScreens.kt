package com.example.appadvogados.Navigation

sealed class MainNavigationScreens(val route: String) {
    object Register: MainNavigationScreens("register")
    object HomeScreen: MainNavigationScreens("home_screen")

    object LoginScreen: MainNavigationScreens("login_screen")

}
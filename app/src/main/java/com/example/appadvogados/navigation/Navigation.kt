package com.example.appadvogados.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appadvogados.presentation.login.LoginScreen
import com.example.appadvogados.presentation.RegisterScreen

@Composable
fun MainNav() {
    val nav = rememberNavController()
    NavHost(
        navController = nav,
        startDestination = MainNavigationScreens.LoginScreen.route
    ) {
        mainGraph(nav)
    }
}

fun NavGraphBuilder.mainGraph(nav: NavHostController) {
    composable(MainNavigationScreens.LoginScreen.route) {
        LoginScreen(nav)
    }
    
    composable(MainNavigationScreens.Register.route) {
        RegisterScreen(nav = nav)
    }
}
package com.example.appadvogados.presentation.login

data class LoginState(
    val loading: Boolean = false,
    val error: String = "Deu muito ruim",
    val user: User? = null
)
data class User(
    val name: String,
    val lastName: String
)
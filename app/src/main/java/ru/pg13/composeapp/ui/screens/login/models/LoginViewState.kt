package ru.pg13.composeapp.ui.screens.login.models

enum class LoginSubState {
    SignUp, SignIn, Forgot
}

data class LoginViewState(
    val loginSubState: LoginSubState = LoginSubState.SignIn,
    val emailValue: String = "",
    val passwordValue: String = "",
    val fullNameValue: String = "",
    val rememberMeChecked: Boolean = false,
    val isLoginProcess: Boolean = false
)

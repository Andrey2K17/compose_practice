package ru.pg13.composeapp.ui.screens.login

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import ru.pg13.composeapp.navigation.NavigationTree

@Composable
fun SplashScreen(navController: NavController) {
    LaunchedEffect(key1 = Unit, block = {
        navController.navigate(NavigationTree.Login.name)
    })
}
package ru.pg13.composeapp.ui.theme

import androidx.compose.ui.graphics.Color

data class Colors(
    val primaryBackground: Color,
    val secondaryBackground: Color,
    val headerTextColor: Color,
    val primaryTextColor: Color,
    val primaryTextInvertColor: Color,
    val hintTextColor: Color,
    val primaryTintColor: Color,
    val secondaryTintColor: Color,
    val accentColor: Color,
    val notificationColor: Color,
    val actionTextColor: Color
)

val lightPalette = Colors(
    primaryBackground = Color.White,
    secondaryBackground = Color(0X10D0CCC7),
    headerTextColor = Color(0xFF311F09),
    primaryTextColor = Color(0xFF594428),
    primaryTextInvertColor = Color(0xFFFFFFFF),
    hintTextColor = Color(0xFFA0978C),
    primaryTintColor = Color(0xFFFF8A00),
    secondaryTintColor = Color(0xFF3FA72F),
    accentColor = Color(0xFF8AEAFF),
    notificationColor = Color(0xFFFF3838),
    actionTextColor = Color(0xFF0094FF)
)
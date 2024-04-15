package com.example.descripta.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class CustomSpace(
    val mini: Dp = 5.dp,
    val small: Dp = 10.dp,
    val average: Dp = 15.dp,
    val smallDivider: Dp = 20.dp,
    val big: Dp = 25.dp,
    val bigDivider: Dp = 45.dp,
)

val LocalSpaces = staticCompositionLocalOf { CustomSpace() }
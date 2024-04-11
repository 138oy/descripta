package com.example.descripta.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.dp

data class CustomShape(
    val RoundedShape: RoundedCornerShape = RoundedCornerShape(5.dp),
    val BottomRoundedShape: RoundedCornerShape =
        RoundedCornerShape(bottomStart = 5.dp, bottomEnd = 5.dp),
    val TopRoundedShape: RoundedCornerShape = RoundedCornerShape(topStart = 5.dp, topEnd = 5.dp)
)

val LocalShapes = staticCompositionLocalOf { CustomShape() }
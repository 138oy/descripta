package com.example.descripta.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.descripta.ui.theme.kits.AclonicaFamily
import com.example.descripta.ui.theme.kits.MontserratFamily
import com.example.descripta.ui.theme.kits.RobotoSlabFamily

//TODO: THIS SHIT IS MESSY SO JUST ADD MORE AS YOU GO

data class CustomTypography(
    val logo: TextStyle = TextStyle(
        fontFamily = AclonicaFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 50.sp
    ),

    val logoSmall: TextStyle = TextStyle(
        fontFamily = AclonicaFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp
    ),

    val inputLabel: TextStyle = TextStyle(
        fontFamily = RobotoSlabFamily,
        fontWeight = FontWeight.Thin,
        fontSize = 15.sp
    ),

    val inputPlaceholder: TextStyle = TextStyle(
        fontFamily = MontserratFamily,
        fontWeight = FontWeight.Light,
        fontSize = 10.sp
    ),

    val buttonText: TextStyle = TextStyle(
        fontFamily = MontserratFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp
    ),

    val buttonTextLight: TextStyle = TextStyle(
        fontFamily = MontserratFamily,
        fontWeight = FontWeight.Light,
        fontSize = 15.sp
    ),
)

val LocalTypography = staticCompositionLocalOf { CustomTypography() }


package com.example.descripta.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.example.descripta.ui.theme.kits.Creme
import com.example.descripta.ui.theme.kits.DarkBrown
import com.example.descripta.ui.theme.kits.DarkGray
import com.example.descripta.ui.theme.kits.PastelBrown
import com.example.descripta.ui.theme.kits.Pink40
import com.example.descripta.ui.theme.kits.Pink80
import com.example.descripta.ui.theme.kits.Purple40
import com.example.descripta.ui.theme.kits.Purple80
import com.example.descripta.ui.theme.kits.PurpleGrey40
import com.example.descripta.ui.theme.kits.PurpleGrey80
import com.example.descripta.ui.theme.kits.White

//TODO: DARK THEME

fun DarkColorScheme() = LightColorScheme()

fun LightColorScheme() = CustomColor(
    background = Creme,
    surfaces = White,
    buttonTint = PastelBrown,
    buttonIcon = DarkGray,
    caps = PastelBrown,
    text = DarkBrown,
    outlines = PastelBrown,
    isDarkTheme = false
)

@Composable
fun DescriptaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    //TODO: REPLACE WITH CUSTOM THEME

    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme()
        else -> LightColorScheme()
    }
    val view = LocalView.current
//    if (!view.isInEditMode) {
//        SideEffect {
//            val window = (view.context as Activity).window
//            window.statusBarColor = colorScheme.primary.toArgb()
//            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
//        }
//    }
//
//
//    MaterialTheme(
//        colorScheme = colorScheme,
//        typography = Typography,
//        content = content
//    )
}
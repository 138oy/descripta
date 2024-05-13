package com.example.descripta.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import com.example.descripta.ui.theme.kits.Creme
import com.example.descripta.ui.theme.kits.DarkBrown
import com.example.descripta.ui.theme.kits.DarkGray
import com.example.descripta.ui.theme.kits.PastelBrown
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
    colors: CustomColor = CustomTheme.colors,
    typography: CustomTypography = CustomTheme.typography,
    shapes: CustomShape = CustomTheme.shapes,
    spaces: CustomSpace = CustomTheme.spaces,
    darkColors: CustomColor? = null,
    darkTheme: Boolean = isSystemInDarkTheme(),

    content: @Composable () -> Unit,
) {
    val currentColor = remember { if (darkColors != null && darkTheme) darkColors else colors }
    val rememberedColors = remember { currentColor.copy() }.apply { updateColorsFrom(currentColor) }

    CompositionLocalProvider(
        LocalColors provides rememberedColors,
        LocalTypography provides typography,
        LocalShapes provides shapes,
        LocalSpaces provides spaces,
    ) {
        ProvideTextStyle(
            typography.default.copy(color = CustomTheme.colors.text),
            content = content
        )
    }
}
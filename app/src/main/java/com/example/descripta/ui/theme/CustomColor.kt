package com.example.descripta.ui.theme

import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import com.example.descripta.ui.theme.kits.DarkGray

class CustomColor(
    background: Color,
    surfaces: Color,
    buttonTint: Color,
    buttonIcon: Color,
    caps: Color,
    text: Color,
    secondaryText: Color? = DarkGray,
    outlines: Color,
    isDarkTheme: Boolean,
) {

    var background by mutableStateOf(background)
        private set

    var surfaces by mutableStateOf(surfaces)
        private set

    var buttonTint by mutableStateOf(buttonTint)
        private set

    var buttonIcon by mutableStateOf(buttonIcon)

    var caps by mutableStateOf(caps)
        private set

    var text by mutableStateOf(text)
        private set

    var secondaryText by mutableStateOf(secondaryText)
        private set

    var outlines by mutableStateOf(outlines)
        private set

    var isDarkTheme by mutableStateOf(isDarkTheme)
        private set

    fun copy(
        background: Color = this.background,
        surfaces: Color = this.surfaces,
        buttonTint: Color = this.buttonTint,
        buttonIcon: Color = this.buttonIcon,
        caps: Color = this.caps,
        text: Color = this.text,
        secondaryText: Color? = this.secondaryText,
        outlines: Color = this.outlines,
        isDarkTheme: Boolean = this.isDarkTheme,
    ) = CustomColor(
        background = background,
        surfaces = surfaces,
        buttonTint = buttonTint,
        buttonIcon = buttonIcon,
        caps = caps,
        text = text,
        secondaryText = secondaryText,
        outlines = outlines,
        isDarkTheme = isDarkTheme,
    )

    fun updateColorsFrom(other: CustomColor) {
        background = other.background
        surfaces = other.surfaces
        buttonTint = other.buttonTint
        buttonIcon = other.buttonIcon
        caps = other.caps
        text = other.text
        secondaryText = other.secondaryText
        outlines = other.outlines
        isDarkTheme = other.isDarkTheme
    }
}

val LocalColors = staticCompositionLocalOf { LightColorScheme() }
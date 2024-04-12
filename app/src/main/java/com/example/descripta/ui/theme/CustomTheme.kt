package com.example.descripta.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable

object CustomTheme {

    val colors: CustomColor
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    val typography: CustomTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current

    val shapes: CustomShape
        @Composable
        @ReadOnlyComposable
        get() = LocalShapes.current

    // TODO: ADD CUSTOM SPACES HERE

//    val spaces: CustomSpaces
//        @Composable
//        @ReadOnlyComposable
//        get() = LocalSpaces.current
}
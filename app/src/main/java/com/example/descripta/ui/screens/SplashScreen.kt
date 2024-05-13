package com.example.descripta.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.descripta.ui.components.DescriptaLogo
import com.example.descripta.ui.theme.CustomTheme

@Composable
fun SplashScreen(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    )
    {
        DescriptaLogo(style = CustomTheme.typography.logo)
    }
}

@Preview(showBackground = true)
@Composable
private fun SplashPreview() {
    SplashScreen(modifier = Modifier.fillMaxSize())
}

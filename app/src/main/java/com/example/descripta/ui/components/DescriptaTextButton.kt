package com.example.descripta.ui.components

import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.descripta.ui.theme.CustomTheme

@Composable
fun DescriptaTextButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    tintColor: Color,
    text: String,
) {
    TextButton(
        modifier = modifier,
        onClick = onClick,
        shape = CustomTheme.shapes.RoundedShape,
        colors = ButtonDefaults.textButtonColors(
            containerColor = tintColor,
            contentColor = CustomTheme.colors.text
        ),
        elevation = ButtonDefaults.buttonElevation(2.dp)
    ) {
        Text(
            text = text,
            style = CustomTheme.typography.buttonTextLight
        )
    }
}
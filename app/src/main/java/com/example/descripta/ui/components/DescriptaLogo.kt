package com.example.descripta.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import com.example.descripta.R
import com.example.descripta.ui.theme.CustomTheme

@Composable
fun DescriptaLogo(
    modifier: Modifier = Modifier,
    style: TextStyle,
) {
    Text(
        modifier = modifier,
        text = stringResource(R.string.app_title),
        style = style,
        color = CustomTheme.colors.text
    )
}
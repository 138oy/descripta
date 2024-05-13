package com.example.descripta.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.descripta.ui.theme.CustomTheme

@Composable
fun DescriptaTextField(
    modifier: Modifier = Modifier,
    label: String?,
    placeholder: String?,
    inputValue: MutableState<String>,
) {
    Column(modifier = modifier) {
        label?.let {
            Text(
                modifier = Modifier.padding(
                    start = CustomTheme.spaces.small,
                    bottom = CustomTheme.spaces.small
                ),
                text = label,
                style = CustomTheme.typography.inputLabel,
                color = CustomTheme.colors.text
            )
        }

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .size(width = 250.dp, height = 75.dp)
                .padding(bottom = CustomTheme.spaces.big),
            value = inputValue.value,
            onValueChange = { inputValue.value = it },
            singleLine = true,
            placeholder = {
                placeholder?.let {
                    Text(
                        text = placeholder,
                        style = CustomTheme.typography.inputPlaceholder,
                        color = CustomTheme.colors.secondaryText
                    )
                }
            },
            shape = CustomTheme.shapes.RoundedShape,
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = CustomTheme.colors.outlines,
                unfocusedBorderColor = CustomTheme.colors.outlines,
                focusedTextColor = CustomTheme.colors.text,
                unfocusedTextColor = CustomTheme.colors.text
            ),
            textStyle = CustomTheme.typography.default
        )
    }
}
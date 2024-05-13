package com.example.descripta.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.descripta.R
import com.example.descripta.ui.components.DescriptaLogo
import com.example.descripta.ui.components.DescriptaTextButton
import com.example.descripta.ui.components.DescriptaTextField
import com.example.descripta.ui.theme.CustomTheme

// TODO: ADD LOGIC

@Composable
fun SignUpScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController?
) {
    val username = rememberSaveable { mutableStateOf("") }
    val login = rememberSaveable { mutableStateOf("") }
    val email = rememberSaveable { mutableStateOf("") }
    val password = rememberSaveable { mutableStateOf("") }

    SignUpScreen(
        modifier = modifier,
        username = username,
        login = login,
        email = email,
        password = password,
        navController = navController
    )
}

@Composable
private fun SignUpScreen(
    modifier: Modifier = Modifier,
    username: MutableState<String>,
    login: MutableState<String>,
    email: MutableState<String>,
    password: MutableState<String>,
    navController: NavHostController?
) {
    Box(
        modifier = modifier.padding(horizontal = CustomTheme.spaces.indent),
        contentAlignment = Alignment.Center
    )
    {
        Column()
        {
            DescriptaLogo(
                modifier = Modifier
                    .padding(bottom = CustomTheme.spaces.big)
                    .align(alignment = Alignment.CenterHorizontally),
                style = CustomTheme.typography.logoSmall,
            )

            DescriptaTextField(
                label = stringResource(id = R.string.input_username_label),
                placeholder = stringResource(id = R.string.input_username_placeholder),
                inputValue = username
            )

            DescriptaTextField(
                label = stringResource(id = R.string.input_login_label),
                placeholder = stringResource(id = R.string.input_login_placeholder),
                inputValue = login
            )

            DescriptaTextField(
                label = stringResource(id = R.string.input_email_label),
                placeholder = stringResource(id = R.string.input_email_placeholder),
                inputValue = email
            )

            DescriptaTextField(
                label = stringResource(id = R.string.input_password_label),
                placeholder = stringResource(id = R.string.input_password_placeholder),
                inputValue = password
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            )
            {
                DescriptaTextButton(
                    onClick = { navController?.popBackStack() },
                    tintColor = CustomTheme.colors.surfaces,
                    text = stringResource(id = R.string.textbutton_cancel)
                )

                DescriptaTextButton(
                    onClick = { /*TODO: LAUNCH SIGNING UP*/ },
                    tintColor = CustomTheme.colors.buttonTint,
                    text = stringResource(id = R.string.textbutton_done)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SignUpPreview() {
    SignUpScreen(Modifier.fillMaxSize(), null)
}

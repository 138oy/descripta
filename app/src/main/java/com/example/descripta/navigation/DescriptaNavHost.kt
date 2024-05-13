package com.example.descripta.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.descripta.ui.screens.SignInScreen
import com.example.descripta.ui.screens.SignUpScreen
import com.example.descripta.ui.screens.SplashScreen
import kotlinx.coroutines.delay

@Composable
fun DescriptaNavHost(
    navController: NavHostController,
    startDestination: String,
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
    ) {

        composable(route = AppDestinations.SplashScreen.route) {
            LaunchedEffect(key1 = Unit) {
                delay(1500L)
                navController.navigate(route = AppDestinations.SingInScreen.route)
            }
            SplashScreen(modifier = Modifier.fillMaxSize())
        }

        composable(route = AppDestinations.SingInScreen.route) {
            SignInScreen(
                modifier = Modifier.fillMaxSize(),
                navController = navController
            )
            navController.clearBackStack(route = AppDestinations.SingInScreen.route)
        }

        composable(route = AppDestinations.SignUpScreen.route) {
            SignUpScreen(modifier = Modifier.fillMaxSize(), navController = navController)
        }
    }
}

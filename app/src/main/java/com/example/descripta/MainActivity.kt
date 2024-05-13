package com.example.descripta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.descripta.navigation.AppDestinations
import com.example.descripta.navigation.DescriptaNavHost
import com.example.descripta.ui.theme.CustomTheme
import com.example.descripta.ui.theme.DescriptaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DescriptaTheme() {
                // A surface container using the 'background' color from the theme
                val appState = rememberAppState()

                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(CustomTheme.colors.background)
                ) {
                    DescriptaNavHost(
                        navController = appState.navController,
                        startDestination = AppDestinations.SplashScreen.route
                    )
                }
            }
        }
    }
}

package com.example.descripta.navigation

import androidx.navigation.NavArgument

interface AppDestination {
    val route: String
    val deeplink: String?
    val arguments: List<NavArgument>?
}

sealed interface AppDestinations {
    object SplashScreen : AppDestination {
        override val route = "splash"
        override val deeplink = null
        override val arguments = null
    }

    object SingInScreen : AppDestination {
        override val route = "sing_in"
        override val deeplink = null
        override val arguments = null
    }

    object SignUpScreen : AppDestination {
        override val route = "sign_up"
        override val deeplink = null
        override val arguments = null
    }
}
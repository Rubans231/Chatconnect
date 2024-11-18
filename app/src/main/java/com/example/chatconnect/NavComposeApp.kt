package com.example.chatconnect

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.chatconnect.nav.Action
import com.example.chatconnect.nav.Destination
import com.example.chatconnect.ui.theme.ChatconnectTheme
import com.example.chatconnect.view.AuthenticationView
import com.example.chatconnect.view.home.HomeView
import com.example.chatconnect.view.login.LoginView
import com.example.chatconnect.view.register.RegisterView
import com.google.firebase.auth.FirebaseAuth

@Composable
fun NavComposeApp() {
    // Create NavController for navigation
    val navController = rememberNavController()
    val actions = remember(navController) { Action(navController) }

    // Apply the app theme
    ChatconnectTheme {
        // Determine the start destination based on FirebaseAuth state
        val startDestination = if (FirebaseAuth.getInstance().currentUser != null) {
            Destination.Home
        } else {
            Destination.AuthenticationOption
        }

        // Define navigation graph
        NavHost(
            navController = navController,
            startDestination = startDestination
        ) {
            // Authentication option screen
            composable(Destination.AuthenticationOption) {
                AuthenticationView(
                    register = actions.register,
                    login = actions.login
                )
            }

            // Register screen
            composable(Destination.Register) {
                RegisterView(
                    home = actions.home,
                    back = actions.navigateBack
                )
            }

            // Login screen
            composable(Destination.Login) {
                LoginView(
                    home = actions.home,
                    back = actions.navigateBack
                )
            }

            // Home screen
            composable(Destination.Home) {
                HomeView()
            }
        }
    }
}

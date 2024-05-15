package com.example.firebasestorage.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.ui.theme.screens.about.about
import com.example.firebasestorage.ui.theme.screens.home.homescreen
import com.example.firebasestorage.ui.theme.screens.login.LoginScreen
import com.example.firebasestorage.ui.theme.screens.products.AddProductsScreen
import com.example.firebasestorage.ui.theme.screens.shop.shop
import com.example.firebasestorage.ui.theme.screens.signup.SignupScreen
import com.example.firebasestorage.ui.theme.screens.splash.splashscreen
import com.example.firebasestorage.ui.theme.screens.upload.UploadScreen
import com.example.firebasestorage.ui.theme.screens.view.ViewProductsScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController:NavHostController = rememberNavController(), startDestination:String = ROUT_SPLASH) {
    NavHost(navController = navController, modifier=modifier, startDestination = startDestination){
        composable(ROUT_HOME){
            homescreen(navController)
        }

        composable(ROUT_LOGIN){
            LoginScreen(navController)
        }

        composable(ROUT_SIGNUP){
            SignupScreen(navController)
        }

        composable(ROUT_UPLOAD){
            UploadScreen(navController)
        }

        composable(ROUT_SHOP){
            shop(navController)
        }

        composable(ROUT_ABOUT){
            about(navController)
        }

        composable(ROUT_SPLASH){
            splashscreen(navController)
        }

        composable(ROUT_ADD){
            AddProductsScreen(navController)
        }

        composable(ROUT_VIEW){
            ViewProductsScreen(navController)
        }
    }
}
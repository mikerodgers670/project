package com.example.wazitoecommerce.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.ui.theme.screens.CarScreen.CarScreen
import com.example.wazitoecommerce.ui.theme.screens.Gopremium.GoPremiumScreen
import com.example.wazitoecommerce.ui.theme.screens.NatureWallpapers.NatureWallPaperScreen
import com.example.wazitoecommerce.ui.theme.screens.animalwallpaper.AnimalWallPaperScreen
import com.example.wazitoecommerce.ui.theme.screens.home.HomeScreen
import com.example.wazitoecommerce.ui.theme.screens.livewallpappers.LiveWallPaperScreen
import com.example.wazitoecommerce.ui.theme.screens.login.LoginScreen

import com.example.wazitoecommerce.ui.theme.screens.products.AddProductsScreen
import com.example.wazitoecommerce.ui.theme.screens.products.ViewProductsScreen
import com.example.wazitoecommerce.ui.theme.screens.signup.SignupScreen
import com.example.wazitoecommerce.ui.theme.screens.splash.SplashScreen1

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = SPLASH_SCREEN_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }
        composable(SIGNUP_URL){
            SignupScreen(navController = navController)
        }
        composable(HOME_URL){
            HomeScreen(navController = navController)
        }
        composable(ADD_PRODUCTS_URL){
            AddProductsScreen(navController = navController)
        }
        composable(VIEW_PRODUCTS_URL){
            ViewProductsScreen(navController = navController)
        }
        composable(LIVE_WALLPAPERS_URL){
            LiveWallPaperScreen(navController = navController)
        }

        composable(GO_PREMIUM_URL){
            GoPremiumScreen(navController = navController)
        }
        composable(ANIMAL_WALLPAPER_URL){
            AnimalWallPaperScreen(navController = navController)
        }
        composable(NATURE_WALLPAPERS_URL){
            NatureWallPaperScreen(navController = navController)
        }
        composable(CAR_SCREEN_URL){
            CarScreen(navController = navController)
        }
        composable(SPLASH_SCREEN_URL){
            SplashScreen1(navController =  navController)
        }







    }
}




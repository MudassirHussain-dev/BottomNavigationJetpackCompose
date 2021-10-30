package dev.hmh.bottomnavjpc.bottom_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import dev.hmh.bottomnavjpc.bottom_navigation.screen.HomeScreen
import dev.hmh.bottomnavjpc.bottom_navigation.screen.ProfileScreen
import dev.hmh.bottomnavjpc.bottom_navigation.screen.SettingScreen

@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = BottomBarScreen.Home.route) {
        composable(BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(BottomBarScreen.Profile.route) {
            ProfileScreen()
        }
        composable(BottomBarScreen.Setting.route) {
            SettingScreen()
        }
    }
}
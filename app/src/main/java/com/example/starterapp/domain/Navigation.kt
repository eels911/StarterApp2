package com.example.starterapp.domain

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.starterapp.presentation.list.MovieListScreen
import com.example.starterapp.presentation.list.MovieListViewModel

sealed class Routes(val routes: String) {
    object MainScreen : Routes("MainScreen")
    object DetailsScreen : Routes("DetailsScreen")
}

@Composable
fun Navigation(
    navController: NavHostController,
    mainScreenViewModel: MovieListViewModel,
) {
    NavHost(
        navController = navController,
        startDestination = Routes.MainScreen.routes
    ) {
        composable(Routes.MainScreen.routes) {
            MovieListScreen(navController = navController, mainScreenViewModel)
        }
    }
}
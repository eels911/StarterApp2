package com.example.starterapp.presentation.list

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.starterapp.FilmCard
import com.example.starterapp.presentation.filmdetails.FilmDetailsViewModel

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MovieListScreen(navController: NavController, movieViewModel: MovieListViewModel = viewModel(),
                      id: Int?){
    val films = remember { mutableStateOf(movieViewModel.films.value)}
        LazyVerticalGrid(cells = GridCells.Fixed(2)){
            items(films.value) { movie ->
                FilmCard(film = movie)
            }
        }
    }
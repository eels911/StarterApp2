package com.example.starterapp.presentation.filmdetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.starterapp.R
import com.example.starterapp.data.Film

@Composable
fun FilmDetailsVScreen(navController: NavController,movieViewModel: FilmDetailsViewModel = viewModel(),
                           id: Int?) {
}


@Composable
fun MyApp(){

FilmDetailsVScreen(film = Film(1,"ulu",6,"678",9.0,"uo"))
}


@Composable
fun MovieDetailScreen(
    movieViewModel: MovieDetailViewModel = viewModel(),
    id: Int?
) {
    val movie = movieViewModel.onPressItemMovieScreen(id)

}


@Preview
@Composable
fun MyAppPreview() {
        MyApp()

}


package com.example.starterapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ListItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModelProvider
import com.example.starterapp.data.Film
import com.example.starterapp.presentation.list.MovieListViewModel
import com.example.starterapp.ui.theme.StarterAppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel: MovieListViewModel by viewModels()
        val films = viewModel.generateFilms()
        setContent {
            FilmList(films = films)
        }
    }
}

@Composable
fun FilmCard(film: Film){
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(painter = painterResource(id = film.photo),
            contentDescription = "test",
        modifier = Modifier
            .size(40.dp)
            .clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(text = film.name)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = film.date_publication)
        }
    }
}

@Composable
fun FilmList(films:List<Film>){
    LazyColumn {
        items(films) { film ->
            FilmCard(film)
        }
    }
}
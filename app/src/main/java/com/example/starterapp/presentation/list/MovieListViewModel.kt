package com.example.starterapp.presentation.list

import android.annotation.SuppressLint
import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.starterapp.R
import com.example.starterapp.data.Film
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class MovieListViewModel: ViewModel() {
    var moviesListLiveData: MutableLiveData<List<Film>> = MutableLiveData()

    fun generateFilms(): List<Film> {

        val movie = Film(
            1,
            "Avangers",
            R.drawable.img_movies_item_header_avengers,
            "01.12.2022",
            5.0,
            "the best film"
        )

        val movie2 = Film(
            2,
            "Shrek",
            R.drawable.img_movies_item_header_avengers,
            "01.12.2023",
            5.0,
            "the best film"
        )
        val movie3 = Film(
            3,
            "Cat",
            R.drawable.img_movies_item_header_avengers,
            "01.12.2023",
            5.0,
            "the best film"
        )


        return listOf(movie, movie2, movie3)
    }

}
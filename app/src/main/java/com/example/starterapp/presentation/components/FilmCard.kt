package com.example.starterapp.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.starterapp.data.Film
import com.example.

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
            Image(
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(20.dp)),
                painter = painterResource(R),
                contentDescription = null,
            )
            Text(text = film.name)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = film.date_publication)
        }
    }
}
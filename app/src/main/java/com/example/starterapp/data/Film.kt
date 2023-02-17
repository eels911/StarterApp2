package com.example.starterapp.data

import androidx.annotation.StringRes
import java.io.Serializable

data class Film(
    val id: Int,
    val name: String,
    val photo: Int,
    val date_publication: String,
    val rating: Double,
    val description: String)
    : Serializable
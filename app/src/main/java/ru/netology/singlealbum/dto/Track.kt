package ru.netology.singlealbum.dto

data class Track(
    val id: Int,
    val file: String,
    val isPlaying: Boolean,
    val selected: Boolean
)

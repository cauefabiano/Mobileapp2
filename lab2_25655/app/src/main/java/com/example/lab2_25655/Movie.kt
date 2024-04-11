package com.example.lab2_25655

data class Movie (
    val name: String,
    val imageId: Int,
    val certification: Int,
    val description: String,
    val starring: Array<String>,
    val running_time_mins: Int,
    var seats_remaining: Int,
    var seats_selected: Int,
    val id: Int,
)
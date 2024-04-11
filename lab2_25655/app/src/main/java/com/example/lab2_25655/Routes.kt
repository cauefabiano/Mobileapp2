package com.example.lab2_25655

sealed class Routes(val route: String) {
    object FirstScreen : Routes("Home")
    object SecondScreen : Routes("movie_screen")
}
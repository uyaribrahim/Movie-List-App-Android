package com.uyaribrahim.movieapp.model

data class Movie(
    var id: Int,
    var title: String?,
    var movieYear: Int,
    var movieRated: String?,
    var movieReleased: String?,
    var movieRuntime: String?,
    var movieGenre: String?,
    var movieDirector: String?,
    var movieWriter: String?,
    var movieActors: String?,
    var moviePlot: String?,
    var movieLanguage: String?,
    var movieCountry: String?,
    var movieAwards: String?,
    var moviePoster: String?,
    var movieMetaScore: Int,
    var imdbID: Int,
    var imdbRating: Int,
    var imdbVotes: Int,
    var Response: Boolean,

)

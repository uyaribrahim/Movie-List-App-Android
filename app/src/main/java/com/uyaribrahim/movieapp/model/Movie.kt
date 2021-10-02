package com.uyaribrahim.movieapp.model

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("Title") val movieTitle : String,
    @SerializedName("Year") val movieYear : Int,
    @SerializedName("Rated") val movieRated : String,
    @SerializedName("Released") val movieReleased : String,
    @SerializedName("Runtime") val movieRuntime : String,
    @SerializedName("Genre") val movieGenre : String,
    @SerializedName("Director") val movieDirector : String,
    @SerializedName("Writer") val movieWriter : String,
    @SerializedName("Actors") val movieActors : String,
    @SerializedName("Plot") val moviePlot : String,
    @SerializedName("Language") val movieLanguage : String,
    @SerializedName("Country") val movieCountry : String,
    @SerializedName("Awards") val movieAwards : String,
    @SerializedName("Poster") val moviePoster : String,
    @SerializedName("Ratings") val movieRatings : List<Ratings>,
    @SerializedName("Metascore") val movieMetaScore : String,
    @SerializedName("imdbRating") val movieImdbRating : String,
    @SerializedName("imdbVotes") val movieImdbVotes : String,
    @SerializedName("imdbID") val movieImdbId : String,
    @SerializedName("Type") val movieType : String,
    @SerializedName("DVD") val movieDVD : String,
    @SerializedName("BoxOffice") val movieBoxOffice : String,
    @SerializedName("Production") val movieProductions : String,
    @SerializedName("Website") val movieWebsite : String,
    @SerializedName("Response") val movieResponse : Boolean

)

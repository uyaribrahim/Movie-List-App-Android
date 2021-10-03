package com.uyaribrahim.movieapp.model

import com.google.gson.annotations.SerializedName

data class TvSeries(
    @SerializedName("Title") val tvSeriesTitle : String,
    @SerializedName("Year") val tvSeriesYear : String,
    @SerializedName("Rated") val tvSeriesRated : String,
    @SerializedName("Released") val tvSeriesReleased : String,
    @SerializedName("Runtime") val tvSeriesRuntime : String,
    @SerializedName("Genre") val tvSeriesGenre : String,
    @SerializedName("Director") val tvSeriesDirector : String,
    @SerializedName("Writer") val tvSeriesWriter : String,
    @SerializedName("Actors") val tvSeriesActors : String,
    @SerializedName("Plot") val tvSeriesPlot : String,
    @SerializedName("Language") val tvSeriesLanguage : String,
    @SerializedName("Country") val tvSeriesCountry : String,
    @SerializedName("Awards") val tvSeriesAwards : String,
    @SerializedName("Poster") val tvSeriesPoster : String,
    @SerializedName("Ratings") val tvSeriesRatings : List<Ratings>,
    @SerializedName("Metascore") val tvSeriesMetaScore : String,
    @SerializedName("imdbRating") val tvSeriesImdbRating : Double,
    @SerializedName("imdbVotes") val tvSeriesImdbVotes : String,
    @SerializedName("imdbID") val tvSeriesImdbId : String,
    @SerializedName("Type") val tvSeriesType : String,
    @SerializedName("totalSeasons") val tvSeriesTotalSeason : Int,
    @SerializedName("Response") val tvSeriesResponse : Boolean
)

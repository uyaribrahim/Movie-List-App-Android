package com.uyaribrahim.movieapp.model

import com.google.gson.annotations.SerializedName

data class Ratings (

    @SerializedName("Source") val ratingSource : String,
    @SerializedName("Value") val ratingValue : String
)
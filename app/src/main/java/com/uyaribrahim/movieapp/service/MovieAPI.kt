package com.uyaribrahim.movieapp.service

import com.uyaribrahim.movieapp.model.Movie
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface MovieAPI {

    var API_KEY: String

    @GET("uyaribrahim/DataSet/main/moviedataset.json")

    fun getMovies(): Single<List<Movie>>


}
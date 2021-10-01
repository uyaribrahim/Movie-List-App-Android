package com.uyaribrahim.movieapp.service

import com.uyaribrahim.movieapp.model.Movie
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.plugins.RxJavaPlugins
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class MovieAPIService {

    private val BASE_URL: String = "http://www.omdbapi.com/"
    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
        .build().create(MovieAPI::class.java)

    fun getData(): Single<List<Movie>>{
        return api.getMovies()
    }

}
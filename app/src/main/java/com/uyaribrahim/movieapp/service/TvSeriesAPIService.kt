package com.uyaribrahim.movieapp.service

import com.uyaribrahim.movieapp.model.TvSeries
import io.reactivex.rxjava3.core.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class TvSeriesAPIService {

    private val BASE_URL: String = "https://raw.githubusercontent.com/"
    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
        .build().create(TvSeriesAPI::class.java)

    fun getData(): Single<List<TvSeries>>{
        return api.getTvSeries()
    }

}
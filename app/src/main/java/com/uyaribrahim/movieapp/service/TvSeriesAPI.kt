package com.uyaribrahim.movieapp.service

import com.uyaribrahim.movieapp.model.TvSeries
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface TvSeriesAPI {

    @GET("uyaribrahim/DataSet/main/tvshowdataset.json")
    fun getTvSeries(): Single<List<TvSeries>>
}
package com.uyaribrahim.movieapp.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.uyaribrahim.movieapp.model.Movie
import com.uyaribrahim.movieapp.service.MovieAPIService
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.observers.DisposableSingleObserver
import io.reactivex.rxjava3.schedulers.Schedulers

class MovieViewModel: ViewModel() {
    val movies: MutableLiveData<List<Movie>> = MutableLiveData()
    val movieError: MutableLiveData<Boolean> = MutableLiveData()
    val movieLoading: MutableLiveData<Boolean> = MutableLiveData()

    private val movieApiService = MovieAPIService()
    private val disposable = CompositeDisposable()

    fun refreshData(){
        getDataFromAPI()
    }

    private fun getDataFromAPI() {
        movieLoading.value = true

        disposable.add(
            movieApiService.getData()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<List<Movie>>(){
                    override fun onSuccess(t: List<Movie>?) {
                        movies.value = t
                        movieError.value = false
                        movieLoading.value = false
                        Log.e("##",movies.value.toString())
                    }

                    override fun onError(e: Throwable?) {
                        movieLoading.value = false
                        movieError.value = true
                        Log.e("##",movies.value.toString())
                        e?.printStackTrace()
                    }
                })
        )
    }
}
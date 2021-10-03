package com.uyaribrahim.movieapp.viewmodel

import androidx.lifecycle.MutableLiveData
import com.uyaribrahim.movieapp.model.TvSeries
import com.uyaribrahim.movieapp.service.TvSeriesAPIService
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers.mainThread
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.observers.DisposableSingleObserver
import io.reactivex.rxjava3.schedulers.Schedulers.newThread

class TvSeriesViewModel {

    val tvSeries: MutableLiveData<List<TvSeries>> = MutableLiveData()
    val tvSeriesError: MutableLiveData<Boolean> = MutableLiveData()
    val tvSeriesLoading: MutableLiveData<Boolean> = MutableLiveData()

    private val tvSeriesApiService = TvSeriesAPIService()
    private val disposable = CompositeDisposable()

    fun updateData(){
        getDataFromAPI()
    }

    private fun getDataFromAPI() {
        tvSeriesLoading.value = true

        disposable.add(
        tvSeriesApiService.getData()
            .subscribeOn(newThread())
            .observeOn(mainThread())
            .subscribeWith(object: DisposableSingleObserver<List<TvSeries>>(){
                override fun onSuccess(t: List<TvSeries>?) {
                    tvSeries.value = t
                    tvSeriesError.value = false
                    tvSeriesLoading.value = false
                }

                override fun onError(e: Throwable?) {
                    tvSeriesLoading.value = false
                    tvSeriesError.value = true
                    e?.printStackTrace()
                }

            })

        )
    }
}
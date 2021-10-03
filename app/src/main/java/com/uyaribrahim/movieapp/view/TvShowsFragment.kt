package com.uyaribrahim.movieapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.uyaribrahim.movieapp.R
import com.uyaribrahim.movieapp.adapter.TvSeriesAdapter
import com.uyaribrahim.movieapp.viewmodel.TvSeriesViewModel
import kotlinx.android.synthetic.main.fragment_movies.*
import kotlinx.android.synthetic.main.fragment_movies.recyclerViewMovie
import kotlinx.android.synthetic.main.fragment_tv_shows.*

class TvShowsFragment : Fragment() {

    private lateinit var viewmodel : TvSeriesViewModel
    private val tvSeriesAdapter = TvSeriesAdapter(arrayListOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tv_shows, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewmodel = ViewModelProviders.of(this).get(TvSeriesViewModel::class.java)
        viewmodel.updateData()

        recyclerViewTvSeries.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerViewTvSeries.adapter = tvSeriesAdapter

        observeLiveData()

    }
    fun observeLiveData(){
        viewmodel.tvSeries?.observe(viewLifecycleOwner, Observer {
            recyclerViewTvSeries.visibility = View.VISIBLE
            tvSeriesAdapter.updateTvSeriesList(it)
        })
        viewmodel.tvSeriesLoading?.observe(viewLifecycleOwner, Observer {
            if(it){
                progressTvSeriesLoading.visibility = View.VISIBLE
                recyclerViewTvSeries.visibility = View.GONE
            }
            else{
                progressTvSeriesLoading.visibility = View.GONE
            }

        })
    }

}
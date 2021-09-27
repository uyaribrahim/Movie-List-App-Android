package com.uyaribrahim.movieapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.uyaribrahim.movieapp.R
import com.uyaribrahim.movieapp.adapter.MovieAdapter
import com.uyaribrahim.movieapp.viewmodel.MovieViewModel
import kotlinx.android.synthetic.main.fragment_movies.*

class MoviesFragment : Fragment() {

    private lateinit var viewmodel : MovieViewModel
    private val movieAdapter = MovieAdapter(arrayListOf())


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movies, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewmodel = ViewModelProviders.of(this).get(MovieViewModel::class.java)
        viewmodel.refreshData()

        recyclerViewMovie.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        recyclerViewMovie.adapter = movieAdapter

        observeLiveData()

    }

    fun observeLiveData(){
        viewmodel.movies?.observe(viewLifecycleOwner, Observer {
            recyclerViewMovie.visibility = View.VISIBLE
            movieAdapter.updateMovieList(it)
        })
    }
}
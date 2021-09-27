package com.uyaribrahim.movieapp.adapter

import android.app.Activity
import android.app.PendingIntent.getActivity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.uyaribrahim.movieapp.R
import com.uyaribrahim.movieapp.model.Movie
import kotlinx.android.synthetic.main.item_movie_tvshow.view.*

class MovieAdapter(val movieList: ArrayList<Movie>): RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    class MovieViewHolder(var view: View): RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_movie_tvshow,parent,false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.view.movieTitle.text = movieList[position].title
        holder.view.movieGenre.text = movieList[position].movieGenre

        Glide.with(holder.view)
            .load(movieList[position].moviePoster)
            .placeholder(R.drawable.kateafismall)
            .into(holder.view.movieImage)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }
    fun updateMovieList(newMovieList: List<Movie>){
        movieList.clear()
        movieList.addAll(newMovieList)
        notifyDataSetChanged()
    }
}
package com.uyaribrahim.movieapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.uyaribrahim.movieapp.R
import com.uyaribrahim.movieapp.model.TvSeries
import kotlinx.android.synthetic.main.item_movie_tvshow.view.*

class TvSeriesAdapter(val tvSeriesList: ArrayList<TvSeries>): RecyclerView.Adapter<TvSeriesAdapter.TvSeriesViewHolder>() {
    class TvSeriesViewHolder(var view: View): RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TvSeriesViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_movie_tvshow,parent,false)
        return TvSeriesViewHolder(view)
    }

    override fun onBindViewHolder(holder: TvSeriesViewHolder, position: Int) {
        holder.view.movieTitle.text = tvSeriesList[position].tvSeriesTitle
        holder.view.movieGenre.text = tvSeriesList[position].tvSeriesGenre

        Glide.with(holder.view)
            .load(tvSeriesList[position].tvSeriesPoster)
            .placeholder(R.drawable.kateafismall)
            .into(holder.view.movieImage)
    }

    override fun getItemCount(): Int {
        return tvSeriesList.size
    }
    fun updateTvSeriesList(newTvSeries: List<TvSeries>){
        tvSeriesList.clear()
        tvSeriesList.addAll(newTvSeries)
        notifyDataSetChanged()
    }
}
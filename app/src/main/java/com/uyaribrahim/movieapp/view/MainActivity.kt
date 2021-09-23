package com.uyaribrahim.movieapp.view

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.uyaribrahim.movieapp.view.MoviesFragmentDirections
import com.uyaribrahim.movieapp.R
import com.uyaribrahim.movieapp.databinding.ActivityMainBinding
import com.uyaribrahim.movieapp.databinding.FragmentMoviesBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        setUpTabBar()
    }

    private fun setUpTabBar(){

        binding.bottomNavBar.setItemSelected(R.id.nav_movies)
        binding.bottomNavBar.setOnItemSelectedListener {
            val action = MoviesFragmentDirections.actionMoviesFragmentToTvShowsFragment()
            val secondAction = TvShowsFragmentDirections.actionTvShowsFragmentToMoviesFragment()
            when (it){
                R.id.nav_tvshows -> Navigation.findNavController(this,R.id.fragmentContainerView).navigate(action)
                R.id.nav_movies -> Navigation.findNavController(this,R.id.fragmentContainerView).navigate(secondAction)
            }
        }
    }
}
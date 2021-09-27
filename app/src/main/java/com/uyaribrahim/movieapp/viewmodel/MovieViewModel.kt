package com.uyaribrahim.movieapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.uyaribrahim.movieapp.model.Movie

class MovieViewModel: ViewModel() {
    val movies: MutableLiveData<List<Movie>>? = null
    val movieError: MutableLiveData<Boolean>? = null
    val movieLoading: MutableLiveData<Boolean>? = null

    fun refreshData(){

        val movie = Movie(1,"Kate",2021,"R","10 Sep 2021","106 min",
            "Action, Adventure, Crime","Cedric Nicolas-Troyan",
            "Umair Aleem","Mary Elizabeth Winstead, Woody Harrelson, Miku Patricia Martineau",
            "A female assassin has 24 hours to get vengeance on her murderer before she dies.",
            "English, Japanese","United States","N/A",
            "https://m.media-amazon.com/images/M/MV5BN2IyYzI4YmQtNzBmMi00Mjg3LWI4NTMtNmZjNjk3YjIwZmJhXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_SX300.jpg",
             47,"tt7737528",6.3,"27,804",true)
        val movie2 = Movie(2,"Titanic",1997,"PG-13","19 Dec 1997","194 minn",
            "Drama, Romance","James Cameron",
            "James Cameron","Leonardo DiCaprio, Kate Winslet, Billy Zane",
            "A seventeen-year-old aristocrat falls in love with a kind but poor artist aboard the luxurious, ill-fated R.M.S. Titanic.",
            "English, Swedish, Italian, French","United States, Mexico, Australia","Won 11 Oscars. 125 wins & 83 nominations total",
            "https://m.media-amazon.com/images/M/MV5BMDdmZGU3NDQtY2E5My00ZTliLWIzOTUtMTY4ZGI1YjdiNjk3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SX300.jpg",
            75,"tt0120338",7.8,"1,092,075",true)
        val movie3 = Movie(3,"Kate",2021,"R","10 Sep 2021","106 min",
            "Action, Adventure, Crime","Cedric Nicolas-Troyan",
            "Umair Aleem","Mary Elizabeth Winstead, Woody Harrelson, Miku Patricia Martineau",
            "A female assassin has 24 hours to get vengeance on her murderer before she dies.",
            "English, Japanese","United States","N/A",
            "https://m.media-amazon.com/images/M/MV5BN2IyYzI4YmQtNzBmMi00Mjg3LWI4NTMtNmZjNjk3YjIwZmJhXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_SX300.jpg",
            47,"tt7737528",6.3,"27,804",true)
        val movie4 = Movie(4,"Titanic",1997,"PG-13","19 Dec 1997","194 minn",
            "Drama, Romance","James Cameron",
            "James Cameron","Leonardo DiCaprio, Kate Winslet, Billy Zane",
            "A seventeen-year-old aristocrat falls in love with a kind but poor artist aboard the luxurious, ill-fated R.M.S. Titanic.",
            "English, Swedish, Italian, French","United States, Mexico, Australia","Won 11 Oscars. 125 wins & 83 nominations total",
            "https://m.media-amazon.com/images/M/MV5BMDdmZGU3NDQtY2E5My00ZTliLWIzOTUtMTY4ZGI1YjdiNjk3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SX300.jpg",
            75,"tt0120338",7.8,"1,092,075",true)

        val movieList = arrayListOf<Movie>(movie,movie2,movie3,movie4)

        movies?.value = movieList
        movieError?.value = false
        movieLoading?.value = false

    }

}
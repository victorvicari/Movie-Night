package com.asmat.rolando.popularmovies.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.asmat.rolando.popularmovies.database.entities.FavoriteMovie
import com.asmat.rolando.popularmovies.database.entities.WatchLaterMovie

@Dao
interface MoviesDAO {

    // Favorite

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertFavoriteMovie(movie: FavoriteMovie)

    @Query("SELECT * FROM favorite_movies WHERE id LIKE :id")
    fun findFavoriteMovie(id: Int): LiveData<FavoriteMovie>

    @Query("DELETE FROM favorite_movies WHERE id LIKE :id ")
    fun deleteFavoriteMovie(id: Int)

    @Query("SELECT * FROM favorite_movies")
    fun loadAllFavoriteMovies(): LiveData<List<FavoriteMovie>>

    // Watch Later

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertWatchLaterMovie(movie: WatchLaterMovie)

    @Query("SELECT * FROM watch_later_movies WHERE id LIKE :id")
    fun findWatchLaterMovie(id: Int): LiveData<WatchLaterMovie>

    @Query("DELETE FROM watch_later_movies WHERE id LIKE :id ")
    fun deleteWatchLaterMovie(id: Int)

    @Query("SELECT * FROM watch_later_movies")
    fun loadAllWatchLaterMovies(): LiveData<List<WatchLaterMovie>>

}
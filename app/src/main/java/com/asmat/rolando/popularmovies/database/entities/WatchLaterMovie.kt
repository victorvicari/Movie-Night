package com.asmat.rolando.popularmovies.database.entities

import androidx.room.*

@Entity(tableName = "watch_later_movies")
data class WatchLaterMovie(@PrimaryKey
                           val id: Int,
                           @ColumnInfo(name = "poster_path")
                           val posterPath: String?,
                           val overview: String,
                           @ColumnInfo(name = "release_date")
                           val releaseDate: String,
                           val title: String,
                           @ColumnInfo(name = "backdrop_path")
                           val backdropPath: String?,
                           @ColumnInfo(name = "vote_average")
                           val voteAverage: Double)
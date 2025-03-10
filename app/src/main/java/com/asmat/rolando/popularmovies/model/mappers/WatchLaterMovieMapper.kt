package com.asmat.rolando.popularmovies.model.mappers

import com.asmat.rolando.popularmovies.database.entities.WatchLaterMovie
import com.asmat.rolando.popularmovies.model.Movie

object WatchLaterMovieMapper {

    fun from(data: Movie): WatchLaterMovie {
        return WatchLaterMovie(
                data.id,
                data.posterPath,
                data.overview,
                data.releaseDate,
                data.title,
                data.backdropPath,
                data.voteAverage)
    }
}
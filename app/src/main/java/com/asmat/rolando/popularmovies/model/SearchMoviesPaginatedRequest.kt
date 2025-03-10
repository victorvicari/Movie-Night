package com.asmat.rolando.popularmovies.model

import com.asmat.rolando.popularmovies.networking.the.movie.db.TheMovieDBClient
import com.asmat.rolando.popularmovies.networking.the.movie.db.models.MoviesResponse
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers

data class SearchMoviesPaginatedRequest(private val tmdbClient: TheMovieDBClient) : PaginatedRequest<MoviesResponse.Movie>() {

    private var searchTerm = ""

    override val shouldLoad: Boolean get() { return this.searchTerm.isNotEmpty()}

    fun setSearchTerm(newSearchTerm: String) {
        searchTerm = newSearchTerm
    }

    override fun fetchData(pageToLoad: Int): Single<PagedData<MoviesResponse.Movie>> {
        return tmdbClient
                .searchMovie(searchTerm, pageToLoad)
                .subscribeOn(Schedulers.computation())
                .map { PagedData(it.results, it.total_pages) }
    }

    override fun reset() {
        super.reset()
        searchTerm = ""
    }

}
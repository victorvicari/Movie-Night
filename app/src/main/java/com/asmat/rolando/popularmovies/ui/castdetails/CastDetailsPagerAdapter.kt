package com.asmat.rolando.popularmovies.ui.castdetails

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.asmat.rolando.popularmovies.R
import com.asmat.rolando.popularmovies.ui.common.BaseSectionsPagerAdapter
import com.asmat.rolando.popularmovies.ui.castdetails.personinfo.PersonDetailsFragment
import com.asmat.rolando.popularmovies.ui.castdetails.personmoviecredits.PersonMovieCreditsFragment

class CastDetailsPagerAdapter(private val uiModel: CastDetailsUiModel, fm: androidx.fragment.app.FragmentManager, context: Context) : BaseSectionsPagerAdapter(fm, context) {

    override val fragments: Array<androidx.fragment.app.Fragment>
        get() {
            val personDetailsFragment = PersonDetailsFragment.newInstance(uiModel.personInfoUiModel)
            val personMovieCreditsFragment = PersonMovieCreditsFragment.newInstance(uiModel.personID)
            return arrayOf(personDetailsFragment, personMovieCreditsFragment)
        }

    override val pageTitles: Array<String>
        get() {
            val info = getString(R.string.info)
            val movieCredits = getString(R.string.movie_credits)
            return arrayOf(info, movieCredits)
        }

}
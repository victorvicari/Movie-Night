package com.asmat.rolando.popularmovies.ui.common

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

abstract class BaseSectionsPagerAdapter internal constructor(fm: FragmentManager, private val context: Context) : androidx.fragment.app.FragmentPagerAdapter(fm) {

    //region Abstract
    internal abstract val fragments: Array<Fragment>
    internal abstract val pageTitles: Array<String>

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return pageTitles[position]
    }

    internal fun getString(id: Int): String {
        return context.getString(id)
    }
    //endregion

}

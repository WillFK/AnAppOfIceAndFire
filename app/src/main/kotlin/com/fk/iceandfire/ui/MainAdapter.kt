package com.fk.iceandfire.ui

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.fk.iceandfire.R
import com.fk.iceandfire.ui.book.BookFragment

/**
 * Created by will on 13/02/17.
 */
class MainAdapter(val context: Context, fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment? {
        return when(position) {
            0 -> BookFragment()
            else -> null
        }
    }

    override fun getCount() = 1

    override fun getPageTitle(position: Int): CharSequence {
        return when(position) {
            0 -> context.getString(R.string.book_tab)
            2 -> context.getString(R.string.house_tab)
            3 -> context.getString(R.string.character_tab)
            else -> ""
        }
    }
}
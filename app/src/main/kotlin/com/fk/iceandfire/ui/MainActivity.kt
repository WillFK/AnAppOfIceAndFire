package com.fk.iceandfire.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.fk.iceandfire.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setup()
    }

    private fun setup() {
        setSupportActionBar(mainToolbar)
        mainToolbar.title = getString(R.string.app_name)
        mainViewPager.adapter = MainAdapter(this, supportFragmentManager)
        mainTabLayout.setupWithViewPager(mainViewPager)
    }
}

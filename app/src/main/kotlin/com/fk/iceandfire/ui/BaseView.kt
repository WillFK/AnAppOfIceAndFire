package com.fk.iceandfire.ui

import android.app.Activity
import android.content.Context

/**
 * Created by will on 12/02/17.
 */
interface BaseView {

    fun context(): Context? {
        //Only for activities for now
        return if (this is Activity) {
            this.context()
        } else {
            null
        }
    }
}
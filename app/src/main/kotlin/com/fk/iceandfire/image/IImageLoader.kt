package com.fk.iceandfire.image

import android.widget.ImageView

/**
 * Created by will on 13/02/17.
 */
interface IImageLoader {

    fun loadInto(uri: String, view: ImageView)
}
package com.fk.iceandfire.image

import android.content.Context
import android.widget.ImageView
import com.squareup.picasso.Picasso

/**
 * Created by will on 13/02/17.
 */
class PicassoImageLoader(context: Context) : IImageLoader {

    val picasso = Picasso.with(context)

    override fun loadInto(uri: String, view: ImageView) {
        picasso.load(uri).into(view)
   }
}
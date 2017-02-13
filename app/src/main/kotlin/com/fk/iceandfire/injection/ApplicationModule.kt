package com.fk.iceandfire.injection

import android.content.Context
import com.fk.iceandfire.image.IImageLoader
import com.fk.iceandfire.image.PicassoImageLoader
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by will on 13/02/17.
 */
@Module
class ApplicationModule {

    @Provides
    @Singleton
    fun imageLoader(context: Context): IImageLoader {
        return PicassoImageLoader(context)
    }
}

package com.fk.iceandfire.injection

import android.content.Context

/**
 * Created by will on 13/02/17.
 */
object InjectionUtil {

    var appComponent: ApplicationComponent? = null

    fun buildViewComponent(context: Context) : ViewComponent {
        return DaggerViewComponent
                .builder()
                .applicationComponent(buildAppComponent(context))
                .build()
    }

    fun buildAppComponent(context: Context) : ApplicationComponent{
        if (appComponent == null) {
            appComponent = DaggerApplicationComponent
                    .builder()
                    .androidModule(AndroidModule(context))
                    .build()
        }
        return appComponent!!
    }

}
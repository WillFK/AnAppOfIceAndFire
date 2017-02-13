package com.fk.iceandfire.injection

import com.fk.iceandfire.domain.interactor.IApiInteractor
import com.fk.iceandfire.image.IImageLoader
import dagger.Component
import javax.inject.Singleton

/**
 * Created by will on 13/02/17.
 */
@Singleton
@Component(
        modules = arrayOf(AndroidModule::class, ApplicationModule::class, NetworkModule::class,
                RepositoryModule::class, InteractorModule::class)
)
interface ApplicationComponent {

    //Interactor
    fun apiInteractor(): IApiInteractor

    //Application
    fun imageLoader(): IImageLoader
}
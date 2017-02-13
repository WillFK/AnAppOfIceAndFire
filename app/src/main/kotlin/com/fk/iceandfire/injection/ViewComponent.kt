package com.fk.iceandfire.injection

import android.content.Context
import com.fk.iceandfire.domain.interactor.IApiInteractor
import com.fk.iceandfire.image.IImageLoader
import com.fk.iceandfire.ui.book.BookFragment
import dagger.Component

/**
 * Created by will on 13/02/17.
 */
@ViewScope
@Component(
        dependencies = arrayOf(ApplicationComponent::class)
)
interface ViewComponent {

    fun inject(fragment: BookFragment): BookFragment

    //Interactor
    fun apiInteractor(): IApiInteractor

    //Application
    fun imageLoader(): IImageLoader
}
package com.fk.iceandfire.injection

import com.fk.iceandfire.domain.interactor.ApiInteractor
import com.fk.iceandfire.domain.interactor.IApiInteractor
import com.fk.iceandfire.rest.IApiRepository
import dagger.Module
import dagger.Provides
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Singleton

/**
 * Created by will on 13/02/17.
 */
@Module
class InteractorModule {

    private val execThread = Schedulers.io()
    private val postExecThread = AndroidSchedulers.mainThread()

    @Provides
    @Singleton
    fun provideApi(repository: IApiRepository): IApiInteractor {
        return ApiInteractor(repository, execThread, postExecThread)
    }
}
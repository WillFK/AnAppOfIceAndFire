package com.fk.iceandfire.domain.interactor

import io.reactivex.ObservableTransformer
import io.reactivex.Scheduler

/**
 * Created by will on 13/02/17.
 */
abstract class BaseInteractor(val executionThread: Scheduler, val postExecutionThread: Scheduler) {

    protected fun <T> composeSchedulers(): ObservableTransformer<T, T> {
        return ObservableTransformer { observable ->
            observable
                    .subscribeOn(executionThread)
                    .observeOn(postExecutionThread)
        }
    }
}
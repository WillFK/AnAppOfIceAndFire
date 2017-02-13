package com.fk.iceandfire.ui

/**
 * Created by will on 12/02/17.
 */
abstract class BasePresenter<T: BaseView> {

    protected var view: T? = null

    fun takeView(view: T) {
        this.view = view
    }
}
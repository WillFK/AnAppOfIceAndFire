package com.fk.iceandfire.ui.book

import com.fk.iceandfire.domain.interactor.IApiInteractor
import com.fk.iceandfire.ui.BasePresenter
import com.fk.iceandfire.ui.BookView
import javax.inject.Inject

/**
 * Created by will on 13/02/17.
 */
class BookPresenter @Inject constructor(val apiInteractor: IApiInteractor) : BasePresenter<BookView>() {

    fun setup() {
        apiInteractor.getBook().subscribe {
            view?.loadData(it)
        }
    }
}
package com.fk.iceandfire.ui

import com.fk.iceandfire.domain.model.Book

/**
 * Created by will on 13/02/17.
 */
interface BookView : BaseView {

    fun loadData(books: List<Book>)
}
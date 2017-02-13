package com.fk.iceandfire.ui.book

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fk.iceandfire.R
import com.fk.iceandfire.domain.model.Book
import com.fk.iceandfire.image.IImageLoader
import com.fk.iceandfire.injection.InjectionUtil
import com.fk.iceandfire.ui.BookView
import kotlinx.android.synthetic.main.fragment_book.*
import javax.inject.Inject

/**
 * Created by will on 13/02/17.
 */
class BookFragment: Fragment(), BookView {

    @Inject
    lateinit var presenter: BookPresenter
    @Inject
    lateinit var imageLoader: IImageLoader

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_book, container, false)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (isAdded) {
            setup()
        }
    }

    private fun setup() {
        InjectionUtil.buildViewComponent(context).inject(this)
        presenter.takeView(this)
        bookRecyclerView.layoutManager = LinearLayoutManager(context)
        presenter.setup()
    }

    override fun loadData(books: List<Book>) {
        bookRecyclerView.adapter = BookViewAdapter(books, imageLoader)
    }
}
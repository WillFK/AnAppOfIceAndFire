package com.fk.iceandfire.ui.book

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout
import com.fk.iceandfire.R
import com.fk.iceandfire.domain.model.Book
import com.fk.iceandfire.image.IImageLoader
import kotlinx.android.synthetic.main.book_card.view.*

/**
 * Created by will on 13/02/17.
 */
class BookCard constructor(context: Context?, attributeSet: AttributeSet?) : RelativeLayout(context, attributeSet) {

    constructor(context: Context) : this(context, null)

    init {
        val inflater = context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.book_card, this, true)
    }

    fun setup(book: Book, imageLoader: IImageLoader) {
        bookCardTitle.text = book.name
        bookCardPages.text = context.getString(R.string.book_pages, book.pages.toString())
        imageLoader.loadInto("http://covers.openlibrary.org/b/isbn/${book.isbn}-M.jpg", bookCardImage)
    }
}
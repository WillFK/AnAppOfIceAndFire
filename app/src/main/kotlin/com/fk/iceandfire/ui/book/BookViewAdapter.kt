package com.fk.iceandfire.ui.book

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.fk.iceandfire.domain.model.Book
import com.fk.iceandfire.image.IImageLoader

/**
 * Created by will on 13/02/17.
 */
class BookViewAdapter(val books: List<Book>, val imageLoader: IImageLoader) : RecyclerView.Adapter<BookViewHolder>(){

    override fun onBindViewHolder(holder: BookViewHolder?, position: Int) {
        holder?.card?.setup(books[position], imageLoader)
    }

    override fun getItemCount() = books.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        return BookViewHolder(BookCard(parent.context))
    }
}
package com.fk.iceandfire.domain.interactor

import com.fk.iceandfire.domain.model.Book
import com.fk.iceandfire.domain.model.Character
import com.fk.iceandfire.domain.model.House
import io.reactivex.Observable

/**
 * Created by will on 13/02/17.
 */
interface IApiInteractor {

    fun getBook(): Observable<List<Book>>

    fun getCharacter(page: Int = 0, size: Int): Observable<List<Character>>

    fun getHouses(page: Int = 0, size: Int): Observable<List<House>>
}
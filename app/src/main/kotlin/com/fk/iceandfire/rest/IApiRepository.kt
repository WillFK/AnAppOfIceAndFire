package com.fk.iceandfire.rest

import com.fk.iceandfire.domain.model.Book
import com.fk.iceandfire.domain.model.Character
import com.fk.iceandfire.domain.model.House
import io.reactivex.Observable

/**
 * Created by will on 12/02/17.
 */
interface IApiRepository {

    fun getBook(): Observable<List<Book>>

    fun getCharacter(page: Int = 0, size: Int): Observable<List<Character>>

    fun getHouses(page: Int = 0, size: Int): Observable<List<House>>
}
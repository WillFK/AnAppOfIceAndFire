package com.fk.iceandfire.rest

import com.fk.iceandfire.domain.model.Book
import com.fk.iceandfire.domain.model.Character
import com.fk.iceandfire.domain.model.House
import io.reactivex.Observable

/**
 * Created by will on 12/02/17.
 */
class ApiRestRepository(val apiRest: ApiRest): IApiRepository {

    override fun getBook(): Observable<List<Book>> {
        return apiRest.books().map { it.map { ApiDataMapper.transform(it) } }
    }

    override fun getCharacter(page: Int, size: Int): Observable<List<Character>> {
        return apiRest.characters(page, size).map { it.map { ApiDataMapper.transform(it) } }
    }

    override fun getHouses(page: Int, size: Int): Observable<List<House>> {
        return apiRest.house(page, size).map { it.map { ApiDataMapper.transform(it) } }
    }
}
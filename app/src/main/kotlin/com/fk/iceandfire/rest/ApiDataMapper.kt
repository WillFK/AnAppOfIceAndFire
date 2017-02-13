package com.fk.iceandfire.rest

import com.fk.iceandfire.domain.model.Book
import com.fk.iceandfire.domain.model.Character
import com.fk.iceandfire.domain.model.House

/**
 * Created by will on 12/02/17.
 */
object ApiDataMapper {

    fun transform(source: BookResponse): Book {
        return Book(source.name, source.numberOfPages, source.isbn)
    }

    fun transform(source: CharacterResponse): Character {
        return Character(source.name, source.aliases, source.titles)
    }

    fun transform(source: HouseResponse): House {
        return House(source.name, source.region, source.words)
    }
}
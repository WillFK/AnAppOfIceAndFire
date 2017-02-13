package com.fk.iceandfire.rest

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

/**
 * Created by will on 12/02/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
data class BookResponse(val name: String, val numberOfPages: Int, val isbn: String)

@JsonIgnoreProperties(ignoreUnknown = true)
data class CharacterResponse(val name: String, val aliases: List<String>, val titles: List<String>)

@JsonIgnoreProperties(ignoreUnknown = true)
data class HouseResponse(val name: String, val region: String, val words: String)

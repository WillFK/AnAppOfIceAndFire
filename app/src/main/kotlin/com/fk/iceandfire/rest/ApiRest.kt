package com.fk.iceandfire.rest

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by will on 12/02/17.
 */
interface ApiRest {

    @GET("books")
    fun books(): Observable<List<BookResponse>>

    @GET("characters?page={page}&pageSize={size}")
    fun characters(@Path(value = "page") page: Int, @Path(value = "size") size: Int): Observable<List<CharacterResponse>>

    @GET("house?page={page}&pageSize={size}")
    fun house(@Path(value = "page") page: Int, @Path(value = "size") size: Int): Observable<List<HouseResponse>>
}
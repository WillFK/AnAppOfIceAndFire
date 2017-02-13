package com.fk.iceandfire.injection

import com.fasterxml.jackson.databind.ObjectMapper
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import okhttp3.ConnectionPool
import okhttp3.OkHttpClient
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by will on 12/02/17.
 */
object NetworkHelper {
    private val HOST = "http://anapioficeandfire.com/api/"

    private fun createRetrofitBuilder(client: OkHttpClient,
                                      converter: Converter.Factory): Retrofit.Builder {
        val builder = Retrofit.Builder()
                .baseUrl(HOST)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(converter)
        builder.client(client)
        return builder
    }

    private fun getClient(): OkHttpClient.Builder {
        val httpClient = OkHttpClient.Builder()
        httpClient.retryOnConnectionFailure(true)
        httpClient.connectionPool(ConnectionPool(0, 30, TimeUnit.SECONDS))
        return httpClient
    }

    private fun defaultConverter(jacksonObjectMapper: ObjectMapper): Converter.Factory {
        return JacksonConverterFactory.create(jacksonObjectMapper)
    }


    fun defaultRetrofit(objectMapper: ObjectMapper): Retrofit.Builder {
        return createRetrofitBuilder(getClient().build(), defaultConverter(objectMapper))
    }
}
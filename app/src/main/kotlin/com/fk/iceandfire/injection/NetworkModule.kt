package com.fk.iceandfire.injection

import android.net.Uri
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fk.iceandfire.rest.ApiRest
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * Created by will on 12/02/17.
 */
@Module
class NetworkModule {

    @Provides
    fun provideRestAdapter(
            objectMapper: ObjectMapper): Retrofit {
        return NetworkHelper.defaultRetrofit(objectMapper).build()
    }

    @Provides
    @Singleton
    fun provideApiJsonObjectMapper(): ObjectMapper {
        val objectMapper = ObjectMapper()
        objectMapper
                .registerModule(KotlinModule())
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        val simpleModule = SimpleModule()
        simpleModule
                .addSerializer(Uri::class.java, ToStringSerializer())
        objectMapper
                .registerModule(simpleModule)
                .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
        return objectMapper
    }

    @Provides
    @Singleton
    fun provideApiRest(retrofit: Retrofit): ApiRest {
        return retrofit.create(ApiRest::class.java)
    }
}
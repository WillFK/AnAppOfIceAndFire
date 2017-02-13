package com.fk.iceandfire.injection

import com.fk.iceandfire.rest.ApiRest
import com.fk.iceandfire.rest.ApiRestRepository
import com.fk.iceandfire.rest.IApiRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by will on 13/02/17.
 */
@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideApi(apiRest: ApiRest): IApiRepository {
        return ApiRestRepository(apiRest)
    }
}
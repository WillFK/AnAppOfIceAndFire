package com.fk.iceandfire.domain.interactor

import com.fk.iceandfire.domain.model.Book
import com.fk.iceandfire.domain.model.Character
import com.fk.iceandfire.domain.model.House
import com.fk.iceandfire.rest.IApiRepository
import io.reactivex.Observable
import io.reactivex.Scheduler

/**
 * Created by will on 13/02/17.
 */
class ApiInteractor(val repository: IApiRepository, executionThread: Scheduler, postExecutionThread: Scheduler) :
        BaseInteractor(executionThread, postExecutionThread), IApiInteractor{

    override fun getBook(): Observable<List<Book>> {
        return repository.getBook().compose(composeSchedulers())
    }

    override fun getCharacter(page: Int, size: Int): Observable<List<Character>> {
        return repository.getCharacter(page, size).compose(composeSchedulers())
    }

    override fun getHouses(page: Int, size: Int): Observable<List<House>> {
        return repository.getHouses(page, size).compose(composeSchedulers())
    }
}
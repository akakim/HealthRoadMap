package com.akakim.db

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData

/**
 * @author KIM
 * @version 0.0.1
 * @since 0.0.1
 * @date 2019-05-06
 */

open class WordRepository(private val wordDao : WordDao ) {
    val allWords : LiveData<List<Word>>

    init {
       allWords =  wordDao.getAllWords()
    }


    /**
     * 반드시 백그라운드 스레드에서 돌린다. 왜냐하면 늦게 걸리기 때문에
     * 메인스레드에서 돌리면 ANR에러가 날 수 있기 때문이다.
     *
     */
    @WorkerThread
    suspend  fun insert (word : Word ) {
        wordDao.insert( word )
    }
}
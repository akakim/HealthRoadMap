package com.akakim.db

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

/**
 * @author KIM
 * @version 0.0.1
 * @since 0.0.1
 * @date 2019-05-05
 */

@Dao
interface WordDao{

    @Query("SELECT * FROM word_table ORDER BY word ASC")
    fun getAllWords() : LiveData<List<Word>>


    @Insert
    suspend fun insert(word:Word)

    @Query("DELETE FROM word_table")
    fun deleteAll()

}
package com.akakim.db

import android.content.Context
import android.os.strictmode.InstanceCountViolation
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * @author KIM
 * @version 0.0.1
 * @since 0.0.1
 * @date 2019-05-05
 */

@Database(entities= [Word::class] ,version = 1 )
public abstract class WordRoomDatabase :RoomDatabase(){
    abstract fun wordDao() : WordDao

    companion object {
        @Volatile
        private var INSTANCE : WordRoomDatabase? = null
        fun getDatabase(context: Context,scope:CoroutineScope ):WordRoomDatabase{

            val tempInstance = INSTANCE

            if( tempInstance != null ) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    WordRoomDatabase::class.java,
                    "Word_database"
                ).fallbackToDestructiveMigration()
                    .addCallback( WordDatabaseCallback(scope))



                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }


    /**
     * 데이터를 더하는건 2가지가 있다.
     * DB가 열렸을 때 더하는 것, 그리고 activity를 위해 단어를 더하는 것을 의미한다.
     *
     */
    private class WordDatabaseCallback(
        private val scope : CoroutineScope
    ): RoomDatabase.Callback(){

        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)
        }

        override fun onOpen(db: SupportSQLiteDatabase) {
            super.onOpen(db)

            INSTANCE?.let{
                database ->
                scope.launch (Dispatchers.IO){
                    populateDatabase(database.wordDao())
                }
            }
        }

        suspend fun populateDatabase(wordDao: WordDao){
            var word = Word("hello")
            wordDao.insert( word )
            word = Word("World")
            wordDao.insert( word )
        }
    }
}
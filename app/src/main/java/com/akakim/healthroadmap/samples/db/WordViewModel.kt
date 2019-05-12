package com.akakim.db

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * @author KIM
 * @version 0.0.1
 * @since 0.0.1
 * @date 2019-05-08
 * ViewModel에는 Context 넣지말기 . 그리고  onSaveInstanceState() 를 사용하는게아님.
 */
class WordViewModel (application : Application): AndroidViewModel( application ){
    // add a private member variale to hold reference to the repository
    private val repository : WordRepository
    // cache the list of words
    val allWords: LiveData<List<Word>>

    init {
        val wordsDao = WordRoomDatabase.getDatabase( application ,viewModelScope).wordDao()
        repository = WordRepository( wordsDao )
        allWords = repository.allWords

    }

    /**
     * insert()를 감싸줄(Wrapper) 메소드 생성. 이 방법은 UI로부터 완벽하게 숨겨준다.
     * 우리는 insert() 메소드를메인스레드로부터 떨어지게끔 호출한다. 그래서 우리는
     * 새로운 코루틴을 만들었다.
     */
    fun insert(word: Word) = viewModelScope.launch(Dispatchers.IO){
        repository.insert( word )
    }
}


package com.akakim

//import android.arch.lifecycle.ViewModelProviders
//import android.support.v7.app.AppCompatActivity


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.akakim.db.Word
import com.akakim.db.WordListAdapter
import com.akakim.db.WordViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton
/*
class MainActivity : AppCompatActivity() {

    lateinit var wordViewModel: WordViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        val adapter = WordListAdapter (this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        wordViewModel = ViewModelProviders.of(this).get(WordViewModel::class.java)

        // add observer for the livedata

        wordViewModel.allWords.observe( this , Observer { words ->
            words?.let { adapter.setWords( it ) }

        })

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener{
            var intent =Intent (this@MainActivity,NewWordActivity::class.java)
            startActivityForResult( intent , newWordActivityRequestCode )
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if( requestCode == newWordActivityRequestCode && resultCode == Activity.RESULT_OK ){
            data?.let {
                val word = Word ( it.getStringExtra( NewWordActivity.EXTRA_REPLY))
                wordViewModel.insert(word)
            }
        } else {
            Toast.makeText ( this , R.string.empty_not_saved,
                Toast.LENGTH_SHORT).show()
        }
    }
    companion object {
        const val newWordActivityRequestCode = 1
    }
}*/

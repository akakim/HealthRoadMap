package com.akakim

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import androidx.core.text.TextUtilsCompat
/*

class NewWordActivity : AppCompatActivity() {

    private lateinit var editorView : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_word)

        editorView = findViewById( R.id.edWord )

        val button = findViewById<Button>(R.id.button_save)

        button.setOnClickListener {

            val replyIntent = Intent()
            if( TextUtils.isEmpty( editorView.text )){
                setResult( Activity.RESULT_CANCELED,replyIntent )
            }else {
                val word = editorView.text.toString()
                replyIntent.putExtra( EXTRA_REPLY,word)
                setResult( Activity.RESULT_OK, replyIntent )
            }
        }
    }


    companion object {
        const val EXTRA_REPLY = "com.example.android.wordlistsql.REPLY"
    }

}
*/

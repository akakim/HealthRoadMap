package com.akakim.healthroadmap.ui

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import com.akakim.healthroadmap.R

import kotlinx.android.synthetic.main.activity_weight_tracker.*


/**
 * 주단위로 몸무게를 본다.
 */
class WeightTrackerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weight_tracker)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->

            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

}

package com.akakim.healthroadmap.ui

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.akakim.healthroadmap.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),BottomNavigationView.OnNavigationItemSelectedListener, View.OnClickListener{
    override fun onClick(v: View?) {

        when (v?.id){
            btnCheckWeight.id ->{
                startActivity( Intent( this , WeightTrackerActivity::class.java))
            }
        }
    }

    private lateinit var textMessage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        textMessage = findViewById(R.id.message)
        navView.setOnNavigationItemSelectedListener( this )


        btnCheckWeight.setOnClickListener( this )
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {


        when (item.itemId) {
            R.id.navigation_home -> {
                textMessage.setText(R.string.title_home)
                return true
            }
            R.id.navigation_dashboard -> {
                textMessage.setText(R.string.title_dashboard)
                return true
            }
            R.id.navigation_notifications -> {
                textMessage.setText(R.string.title_notifications)
                return true
            }
        }
        return false
    }

}

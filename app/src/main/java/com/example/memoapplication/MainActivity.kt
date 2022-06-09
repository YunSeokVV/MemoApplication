package com.example.memoapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val add_btn = findViewById<Button>(R.id.add_btn)




        add_btn.setOnClickListener {
            val intent = Intent(this, DetailScreen::class.java)
            startActivity(intent)
        }

    }
}

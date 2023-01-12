package com.example.scrollingtext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Kotlin Developer"
        val text:String="android app scrolling text"
        val textView:TextView = findViewById(R.id.signIn)
        textView.text = text
        textView.isSelected = true


    }
}
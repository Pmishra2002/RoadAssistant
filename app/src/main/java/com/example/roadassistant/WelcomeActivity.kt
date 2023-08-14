package com.example.roadassistant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.TextView

class WelcomeActivity : AppCompatActivity() {
    private lateinit var welcomeTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        welcomeTextView = findViewById(R.id.welcomeTextView)

        val username = intent.getStringExtra("username")
        welcomeTextView.text = "Welcome $username to Road Assistant"
    }
}

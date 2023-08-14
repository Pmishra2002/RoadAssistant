package com.example.roadassistant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class BusinessLoginActivity : AppCompatActivity() {
    private lateinit var shopNameEditText: EditText
    private lateinit var contactNoEditText: EditText
    private lateinit var businessIdEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_business_login)

        shopNameEditText = findViewById(R.id.shopNameEditText)
        contactNoEditText = findViewById(R.id.contactNoEditText)
        businessIdEditText = findViewById(R.id.businessIdEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        loginButton = findViewById(R.id.loginButton)

        loginButton.setOnClickListener {
            // TODO: Implement business login logic here
            // Check if the entered credentials are valid and allow access if appropriate
        }
    }
}

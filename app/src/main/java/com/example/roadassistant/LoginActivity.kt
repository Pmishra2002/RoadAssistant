package com.example.roadassistant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    private lateinit var phoneEditText: EditText
    private lateinit var userIdEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        phoneEditText = findViewById(R.id.phoneEditText)
        userIdEditText = findViewById(R.id.userIdEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        loginButton = findViewById(R.id.loginButton)

        loginButton.setOnClickListener {
            val phone = phoneEditText.text.toString()
            val userId = userIdEditText.text.toString()
            val password = passwordEditText.text.toString()

            // TODO: Implement user login logic here
            // For example, you can check if the entered credentials are valid

            // For demonstration purposes, let's assume login is successful
            val loginSuccessful = true

            if (loginSuccessful) {
                // Navigate to the main activity or another appropriate screen
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                // Display a toast message indicating login failure
                Toast.makeText(this, "Login failed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

package com.example.roadassistant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegistrationActivity : AppCompatActivity() {
    private lateinit var emailEditText: EditText
    private lateinit var phoneEditText: EditText
    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var registerButton: Button
    private lateinit var confirmpasswordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        emailEditText = findViewById(R.id.emailEditText)
        phoneEditText=findViewById(R.id.phoneEditText)
        usernameEditText = findViewById(R.id.usernameEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        confirmpasswordEditText = findViewById(R.id.confirmpasswordEditText)
        registerButton = findViewById(R.id.registerButton)

        registerButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()
            val email = emailEditText.text.toString()
            val phone = phoneEditText.text.toString()
            val confirmpassword = confirmpasswordEditText.text.toString()

            // TODO: Implement user registration logic here
            // For example, you can create a user account and save it to a database

            // For demonstration purposes, let's assume registration is successful
            val registrationSuccessful = true

            if (registrationSuccessful) {
                // Display a toast message indicating successful registration
                Toast.makeText(this, "Registered successfully", Toast.LENGTH_SHORT).show()

                // Once registration is successful, navigate to the welcome page
                val intent = Intent(this, WelcomeActivity::class.java)
                intent.putExtra("username", username)
                startActivity(intent)
                finish()
            } else {
                // Display a toast message indicating registration failure
                Toast.makeText(this, "Registration failed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

package com.example.roadassistant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BusinessOwnerActivity : AppCompatActivity() {
    private lateinit var businessLoginButton: Button
    private lateinit var businessRegistrationButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_business_owner)

        businessLoginButton = findViewById(R.id.businessLoginButton)
        businessRegistrationButton = findViewById(R.id.businessRegistrationButton)

        businessLoginButton.setOnClickListener {
            // Handle business login button click
            val intent = Intent(this, BusinessLoginActivity::class.java)
            startActivity(intent)
        }

        businessRegistrationButton.setOnClickListener {
            // Handle business registration button click
            val intent = Intent(this, BusinessRegistrationActivity::class.java)
            startActivity(intent)
        }
    }
}

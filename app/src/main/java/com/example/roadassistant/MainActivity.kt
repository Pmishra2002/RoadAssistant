package com.example.roadassistant


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.FirebaseApp
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class MainActivity : AppCompatActivity() {

    private lateinit var btnRequestData: Button
    private lateinit var btnUserRegestration: Button
    private lateinit var loginButton: Button
    private lateinit var btnBusinessOwner: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FirebaseApp.initializeApp(this);
        setContentView(R.layout.activity_main)

        val database = FirebaseDatabase.getInstance()
        val firebase : DatabaseReference=FirebaseDatabase.getInstance().getReference()
        btnRequestData=findViewById(R.id.btnRequestData)
        btnRequestData.setOnClickListener {
            val intent = Intent(this, InsertionActivity::class.java)
            startActivity(intent)
        }
        btnUserRegestration=findViewById(R.id.btnUserRegestration)
        btnUserRegestration.setOnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
        }
        loginButton=findViewById(R.id.btnUserLogin)
        loginButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        btnBusinessOwner=findViewById(R.id.btnBusinessOwner)
        btnBusinessOwner.setOnClickListener {
            val intent = Intent(this, BusinessOwnerActivity::class.java)
            startActivity(intent)
        }


    }
}
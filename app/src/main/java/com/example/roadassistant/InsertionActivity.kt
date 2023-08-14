package com.example.roadassistant

//import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
//import com.google.firebase.FirebaseApp
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class InsertionActivity : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var vehicleTypeEditText: EditText
    private lateinit var vehicleNoEditText: EditText
    private lateinit var vehicleLocationEditText: EditText
    private lateinit var mobileNoEditText: EditText
    private lateinit var loginButton: Button

    private lateinit var dbRef: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insertion)

        usernameEditText = findViewById(R.id.usernameEditText)
        vehicleTypeEditText = findViewById(R.id.vehicleTypeEditText)
        vehicleNoEditText = findViewById(R.id.vehicleNoEditText)
        vehicleLocationEditText = findViewById(R.id.vehicleLocationEditText)
        mobileNoEditText = findViewById(R.id.mobileNoEditText)
        loginButton = findViewById(R.id.loginButton)
        dbRef = FirebaseDatabase.getInstance().getReference("user")

        loginButton.setOnClickListener {

           requestdata()
                    }
    }
    private fun requestdata(){
        val username = usernameEditText.text.toString()
        val vehicleType = vehicleTypeEditText.text.toString()
        val vehicleNo = vehicleNoEditText.text.toString()
        val vehicleLocation = vehicleLocationEditText.text.toString()
        val mobileNo = mobileNoEditText.text.toString()

        if(username.isEmpty()){
            usernameEditText.error= "please enter your name"
        }
        if(vehicleType.isEmpty()){
            vehicleTypeEditText.error= "please enter your vehicle type"
        }
        if(vehicleNo.isEmpty()){
            vehicleNoEditText.error= "please enter your vehicle number"
        }
        if(vehicleLocation.isEmpty()){
            vehicleLocationEditText.error= "please enter your vehicle location"
        }
        if(mobileNo.isEmpty()){
            mobileNoEditText.error= "please enter your mobile number"
        }

        val userId=dbRef.push().key!!
        val user= Usermodel(userId,username,vehicleType,vehicleNo,vehicleLocation,mobileNo)
        usernameEditText.text.clear()
        vehicleTypeEditText.text.clear()
        vehicleNoEditText.text.clear()
        vehicleLocationEditText.text.clear()
        mobileNoEditText.text.clear()


        dbRef.child(userId).setValue(user)
            .addOnCompleteListener {
                Toast.makeText(this,"Requst saved successfully",Toast.LENGTH_LONG).show()
            }
            .addOnFailureListener { err->
                Toast.makeText(this,"Error ${err.message}",Toast.LENGTH_LONG).show() }
    }
}

package com.androidluana.androidbikeappca4

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Profile : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences
    lateinit var strName: String
    lateinit var strEmail: String
    lateinit var strPassword: String
    lateinit var strMobile: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val name = findViewById<TextView>(R.id.nameUser)
        val email = findViewById<TextView>(R.id.emailUser)
        val password = findViewById<TextView>(R.id.passwordUser)
        val mobile = findViewById<TextView>(R.id.mobileUser)
        val options = findViewById<Button>(R.id.optionsBttn)

        sharedPreferences = applicationContext.getSharedPreferences("NewUserPrefs", Context.MODE_PRIVATE)
        strName = sharedPreferences.getString("name", "").toString()
        strEmail = sharedPreferences.getString("email", "").toString()
        strPassword = sharedPreferences.getString("password", "").toString()
        strMobile = sharedPreferences.getString("mobile", "").toString()

        name.setText(strName)
        email.setText(strEmail)
        password.setText(strPassword)
        mobile.setText(strMobile)

        options.setOnClickListener {
            openWeather()
        }
    }

    private fun openWeather() {
        val intent = Intent(this, Weather::class.java)
        startActivity(intent)
    }
}
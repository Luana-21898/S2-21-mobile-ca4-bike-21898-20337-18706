package com.androidluana.androidbikeappca4

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Register : AppCompatActivity() {

    private lateinit var nameUserRegister: EditText
    private lateinit var emailRegister: EditText
    private lateinit var passwordRegister: EditText
    private lateinit var mobileRegister: EditText
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var editor: SharedPreferences.Editor
    private lateinit var register: Button
    private lateinit var login: Button
    private lateinit var clear: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        nameUserRegister = findViewById(R.id.nameUserRegister)
        emailRegister = findViewById(R.id.newEmailRegister)
        passwordRegister = findViewById(R.id.passwordRegister)
        mobileRegister = findViewById(R.id.mobileRegister)
        register = findViewById(R.id.registerBttn)
        login = findViewById(R.id.loginHereBttn)
        clear = findViewById(R.id.clearBttn)

        retrieveData()


        register.setOnClickListener {

            saveData()
            openProfile()
        }

        login.setOnClickListener {
            openMainActivity()
        }

        clear.setOnClickListener {
            nameUserRegister.setText("")
            emailRegister.setText("")
            passwordRegister.setText("")
            mobileRegister.setText("")
        }

    }

    private fun openProfile() {
        val intent = Intent(this, Profile::class.java)
        startActivity(intent)
    }

    private fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun retrieveData() {

        val mypref = getSharedPreferences("NewUserPrefs", Context.MODE_PRIVATE)

        val name = mypref.getString("name", "")
        val email = mypref.getString("email", "")
        val password = mypref.getString("password", "")
        val mobile = mypref.getString("mobile", "")

        nameUserRegister.setText(name)
        emailRegister.setText(email)
        passwordRegister.setText(password)
        mobileRegister.setText(mobile)
    }

    private fun saveData() {

        val mypref = getSharedPreferences("NewUserPrefs", Context.MODE_PRIVATE)

        val editor = mypref.edit()

        editor.putString("name", nameUserRegister.text.toString())
        editor.putString("email", emailRegister.text.toString())
        editor.putString("password", passwordRegister.text.toString())
        editor.putString("mobile", mobileRegister.text.toString())

        editor.apply()

        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show()

    }

}

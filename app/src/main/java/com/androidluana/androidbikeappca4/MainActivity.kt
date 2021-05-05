package com.androidluana.androidbikeappca4

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var emailLogin: EditText
    private lateinit var passwordLogin: EditText
    private lateinit var checkBox: CheckBox
    private lateinit var loginButton: Button
    private lateinit var herebttn: Button
    private lateinit var editor: SharedPreferences.Editor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        emailLogin = findViewById(R.id.emailLogin)
        passwordLogin = findViewById(R.id.passwordLogin)
        checkBox = findViewById(R.id.checkBox)
        loginButton = findViewById(R.id.loginBttn)
        herebttn = findViewById(R.id.hereBttn)

        checkSharedPreference()

        loginButton.setOnClickListener {

            if (checkBox.isChecked) {
                editor.putString("checkBox", "True")
                editor.apply()

                emailLogin.text.toString()
                editor.putString("email", emailLogin.text.toString())
                editor.apply()

                passwordLogin.text.toString()
                editor.putString("password", passwordLogin.text.toString())
                editor.apply()

            } else {
                editor.putString("checkBox", "False")
                editor.apply()

                editor.putString("email", "")
                editor.apply()

                editor.putString("password", "")
                editor.apply()
            }

            openProfile()
            Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show()
        }

        herebttn.setOnClickListener {
            openRegister()
        }
    }

    private fun checkSharedPreference() {

        val mypref = getSharedPreferences("LoginUser", Context.MODE_PRIVATE)
        editor = mypref.edit()

        val strEmail = mypref.getString("email", "")
        val strPassword = mypref.getString("password", "")
        val strCheckBox = mypref.getString("checkBox", "False")

        emailLogin.setText(strEmail)
        passwordLogin.setText (strPassword)
        checkBox.isChecked = strCheckBox == "True"

        editor.apply()

    }

    private fun openProfile() {
        val intent = Intent(this, Profile::class.java)
        startActivity(intent)
    }

    private fun openRegister() {
        val intent = Intent(this, Register::class.java)
        startActivity(intent)
    }
}
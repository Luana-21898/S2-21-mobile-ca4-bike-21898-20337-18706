package com.androidluana.androidbikeappca4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Options : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options)

        val OpenDubMap: Button =findViewById(R.id.dublinMap)
        val OpenLyonMap: Button =findViewById(R.id.lyonMap)
        val OpenWeather: Button =findViewById(R.id.weatherBtn)

        OpenDubMap.setOnClickListener{
            val intent= Intent(applicationContext,DublinMap::class.java)
            startActivity(intent)
        }


        OpenLyonMap.setOnClickListener{
            val intent= Intent(applicationContext,LyonMap::class.java)
            startActivity(intent)
        }


        OpenWeather.setOnClickListener{
            val intent= Intent(applicationContext,Weather::class.java)
            startActivity(intent)
        }

    }
}
package com.example.projectmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MenuProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_profile)
    }
    fun logout(view: View?) {
        val i = Intent(applicationContext, Masuk ::class.java)
        startActivity(i)

    }
    fun about(view: View?) {
        val i = Intent(applicationContext, about::class.java)
        startActivity(i)

    }
}
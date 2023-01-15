package com.example.projectmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Daftar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)
    }
    fun login(view: View?) {
        val i = Intent(applicationContext, Masuk::class.java)
        startActivity(i)

    }
    fun daftar(view: View?) {
        val i = Intent(applicationContext, Masuk::class.java)
        startActivity(i)

    }
}
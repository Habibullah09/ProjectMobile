package com.example.projectmobile

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class onboarding3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding3)
    }
    fun startt(view: View?) {
        val i = Intent(applicationContext, Daftar::class.java)
        startActivity(i)

    }
}
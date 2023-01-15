package com.example.projectmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class List1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list1)
    }

    fun rendanggg(view: View?) {
        val i = Intent(applicationContext, Detail::class.java)
        startActivity(i)

    }

    fun gelamai(view: View?) {
        val i = Intent(applicationContext, Detail::class.java)
        startActivity(i)

    }

    fun das(view: View?) {
        val i = Intent(applicationContext, Dashboard::class.java)
        startActivity(i)

    }
}
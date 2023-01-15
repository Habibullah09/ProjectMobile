package com.example.projectmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }
    fun lihatcaramasak(view: View?) {
        val i = Intent(applicationContext, caramemasak::class.java)
        startActivity(i)
    }
    fun back1(view: View?) {
        val i = Intent(applicationContext, List1::class.java)
        startActivity(i)
    }
}
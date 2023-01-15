package com.example.projectmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Category : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)
    }


    fun foof(view: View?) {
        val i = Intent(applicationContext, List1::class.java)
        startActivity(i)
}
    fun food2(view: View?) {
        val i = Intent(applicationContext, List1::class.java)
        startActivity(i)
    }
    fun food3(view: View?) {
        val i = Intent(applicationContext, List1::class.java)
        startActivity(i)
    }
    fun food4(view: View?) {
        val i = Intent(applicationContext, List1::class.java)
        startActivity(i)
    }
}
package com.example.projectmobile

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.net.URL

class caramemasak : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_caramemasak)
    }
    fun backdetail(view: View?) {
        val i = Intent(applicationContext, Detail::class.java)
        startActivity(i)
    }
}

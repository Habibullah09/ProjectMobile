package com.example.projectmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
    }

    fun profil(view: View?) {
        val i = Intent(applicationContext, MenuProfile::class.java)
        startActivity(i)

    }


    fun minang(view: View?) {
        val i = Intent(applicationContext, List1::class.java)
        startActivity(i)

    }
    fun category(view: View?) {
        val i = Intent(applicationContext, Category::class.java)
        startActivity(i)
    }

    fun aceh(view: View?) {
        val i = Intent(applicationContext, List1::class.java)
        startActivity(i)

    }

    fun rendaggg(view: View?) {
        val i = Intent(applicationContext, Detail::class.java)
        startActivity(i)

    }

    fun gelamai(view: View?) {
        val i = Intent(applicationContext, Detail::class.java)
        startActivity(i)
    }
}
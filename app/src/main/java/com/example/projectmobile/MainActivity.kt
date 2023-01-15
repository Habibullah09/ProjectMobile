package com.example.projectmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding1)

        var handler = Handler()
        handler.postDelayed({
            var intent = Intent(this@MainActivity, onboarding2::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}
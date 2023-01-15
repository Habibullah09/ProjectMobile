package com.example.projectmobile

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class onboarding2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding2)

        var handler = Handler()
        handler.postDelayed({
            var intent = Intent(this@onboarding2, onboarding3::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}
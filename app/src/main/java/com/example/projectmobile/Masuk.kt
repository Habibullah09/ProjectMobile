package com.example.projectmobile
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class Masuk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masuk)
    }
    fun masuk(view: View?) {
        val i = Intent(applicationContext, Dashboard::class.java)
        startActivity(i)

    }
    fun daftarr(view: View?) {
        val i = Intent(applicationContext, Daftar::class.java)
        startActivity(i)

    }
}

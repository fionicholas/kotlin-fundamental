package com.github.fionicholas.kotlinfundamental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin = findViewById<Button>(R.id.bottom)

        btnLogin.setOnClickListener {
            Toast.makeText(this, "Succed Login", Toast.LENGTH_SHORT).show()
        }
    }
}

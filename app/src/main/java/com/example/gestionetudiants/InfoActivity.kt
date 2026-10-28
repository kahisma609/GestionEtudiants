package com.example.gestionetudiants

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class InfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val btnBack = findViewById<Button>(R.id.btnBack)

        // Closes this activity and returns to MainActivity
        btnBack.setOnClickListener {
            finish()
        }
    }
}
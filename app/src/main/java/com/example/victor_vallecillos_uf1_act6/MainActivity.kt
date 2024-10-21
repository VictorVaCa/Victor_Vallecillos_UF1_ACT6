package com.example.victor_vallecillos_uf1_act6

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val editText = findViewById<android.widget.EditText>(R.id.editText)
        val button = findViewById<android.widget.Button>(R.id.button)

        button.setOnClickListener {
            val text = editText.text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }
    }
}
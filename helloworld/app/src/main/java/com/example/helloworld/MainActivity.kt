package com.example.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHello = findViewById<Button>(R.id.btnHello)
        btnHello.setOnClickListener {
            Toast.makeText(this, "Say Hello!", Toast.LENGTH_SHORT).show()
        }
    }
}

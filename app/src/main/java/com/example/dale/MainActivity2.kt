package com.example.dale

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find the buttons by their IDs
        val charactersButton = findViewById<Button>(R.id.button2)
        val weaponsButton = findViewById<Button>(R.id.button3)
        val mainPageButton = findViewById<Button>(R.id.button6)

        // Set OnClickListener for the Characters button
        charactersButton.setOnClickListener {
            // Create an Intent to start MainActivity3
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        // Set OnClickListener for the Weapons button
        weaponsButton.setOnClickListener {
            // Create an Intent to start MainActivity4
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        // Set OnClickListener for the Main page button
        mainPageButton.setOnClickListener {
            // Create an Intent to go back to MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}

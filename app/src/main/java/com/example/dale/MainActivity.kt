package com.example.dale

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find the button by its ID
        val button = findViewById<Button>(R.id.button)

        // Find the EditText by its ID
        val editText = findViewById<EditText>(R.id.editTextText)

        // Set OnClickListener for the button
        button.setOnClickListener {
            // Get the text from EditText
            val inputText = editText.text.toString()

            // Create an Intent to start the next activity
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("EXTRA_TEXT", inputText)
            startActivity(intent)
        }
    }
}

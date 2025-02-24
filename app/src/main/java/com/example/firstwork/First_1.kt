package com.example.firstwork

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class First_1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secod_1)

        val main_text: TextView = findViewById(R.id.main_text)

        main_text.setOnClickListener{
            val intent = Intent(this, first::class.java)
            startActivity(intent)
        }
    }
}

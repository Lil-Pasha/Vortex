package com.example.firstwork

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class itemssAtivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.itemss_ativity)

        val title: TextView = findViewById(R.id.i_l_tit1)
        val text: TextView = findViewById(R.id.i_l_text)

        title.text = intent.getStringExtra("itemTitel")
        text.text = intent.getStringExtra("itemText")


        val button: Button = findViewById(R.id.i_l_b1)
        button.setOnClickListener {

            val animation = AnimationUtils.loadAnimation(this, R.anim.but_cl)
            button.startAnimation(animation)
            val intent = Intent(this, NoteBook::class.java)
            startActivity(intent)
        }

    }
}
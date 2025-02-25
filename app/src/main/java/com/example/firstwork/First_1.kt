package com.example.firstwork

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class First_1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secod_1)

        val userLogin: EditText = findViewById(R.id.usr_1_1)
        val userPass: EditText = findViewById(R.id.usr_2_1)
        val main_text: TextView = findViewById(R.id.main_text)
        val button: Button = findViewById(R.id.b_t1)


        main_text.setOnClickListener {
            val intent = Intent(this, first::class.java)
            startActivity(intent)
        }

        button.setOnClickListener {

            val animation = AnimationUtils.loadAnimation(this, R.anim.but_cl)
            button.startAnimation(animation)

            val login = userLogin.text.toString().trim()
            val pass = userPass.text.toString().trim()


            if (login == "" || pass == "") {
                Toast.makeText(this, "Заполните все поля", Toast.LENGTH_SHORT).show()
            } else {
                User(login, pass)
                val db = Dbhelper(this, null)
                val inAust = db.getUser(login, pass)

                if (inAust) {
                    Toast.makeText(this, "Пользователь существует", Toast.LENGTH_SHORT).show()

                    //Переход на второй экран после успешного добавления пользователя
                    val intent = Intent(this, NoteBook::class.java)
                    Log.d("DEBUG", "Запуск NoteBook")
                    startActivity(intent)
                    finish()


                } else {
                    Toast.makeText(this, "Пользователь не существует", Toast.LENGTH_SHORT).show()
                }

                Toast.makeText(this, "Пользователь добавлен", Toast.LENGTH_SHORT).show()

                userLogin.text.clear()
                userPass.text.clear()



                }
            }
        }
    }
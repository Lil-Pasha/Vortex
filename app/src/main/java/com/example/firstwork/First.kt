package com.example.firstwork

import android.content.Context
import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity

// Функция для проверки подключения к интернету
fun isNetworkAvailable(context: Context): Boolean {
    val connectivityManager =
        context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val network = connectivityManager.activeNetwork ?: return false
    val activeNetwork = connectivityManager.getNetworkCapabilities(network) ?: return false
    return when {
        activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
        activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
        else -> false
    }
}

class first : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secod)

        val userLogin: EditText = findViewById(R.id.usr_1)
        val userPass: EditText = findViewById(R.id.usr_2)

        val rootLayout = findViewById<View>(R.id.rootLayout)
        val animationDrawable = rootLayout.background as? AnimationDrawable
        animationDrawable?.start()

        val main_text1: TextView = findViewById(R.id.main_text1)
        main_text1.setOnClickListener {
            val intent = Intent(this, First_1::class.java)
            startActivity(intent)
        }

        val button: Button = findViewById(R.id.b_t)
        button.setOnClickListener {
            val login = userLogin.text.toString().trim()
            val pass = userPass.text.toString().trim()

            val animation = AnimationUtils.loadAnimation(this, R.anim.but_cl)
            button.startAnimation(animation)

            if (login == "" || pass == "") {
                Toast.makeText(this, "Заполните все поля", Toast.LENGTH_SHORT).show()
            } else {
                val user = User(login, pass)

                val db = Dbhelper(this, null)
                db.addUser(user)
                Toast.makeText(this, "Пользователь добавлен", Toast.LENGTH_SHORT).show()

                userLogin.text.clear()
                userPass.text.clear()

                // Переход на второй экран после успешного добавления пользователя
                val intent = Intent(this, First_1::class.java)
                startActivity(intent)
            }
        }
    }
}





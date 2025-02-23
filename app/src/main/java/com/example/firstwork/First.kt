package com.example.firstwork


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities

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

        val label = findViewById<TextView>(R.id.main_text)
        val userData: EditText = findViewById(R.id.usr_1)
        val button: Button = findViewById(R.id.b_t)

        button.setOnClickListener {
            val wordMap = mapOf(
                "Паша" to "ткг:@pashtetys1",
                "Айба" to "воздухан",
                "Алим" to "сиськастый",
                "Руслан" to "на работу надо",
                "Карина" to "чмошница",
                "Аполля" to "нефор",
                "Адилет" to "читает диз на молоко"

            )
            val text = userData.text.toString().trim()
            if (wordMap.containsKey(text))
                Toast.makeText(this, wordMap[text], Toast.LENGTH_SHORT).show()
            else
                label.text = text
            if (isNetworkAvailable(this))
                Toast.makeText(this, "Интернет доступен", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this, "Нет подключения к интернету", Toast.LENGTH_SHORT).show()
        }
    }
}
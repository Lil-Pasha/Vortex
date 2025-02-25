package com.example.firstwork

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.arrayListOf

class NoteBook : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.note_book)

        val itemList: RecyclerView = findViewById(R.id.iList)
        Log.d("DEBUG", "RecyclerView найден")

        val items = arrayListOf<iTem>()

        items.add(iTem(1, "pc","Топология компьютерной сети","тип Звезда","В центре топологии «Звезда», находится сервер. Все устройства сети (компьютеры) подключены к серверу. Запросы от устройств направляются на сервер, где и обрабатываются. Выход из строя сервера, «убивает» всю сеть. Выход из строя одного устройства, не влияет на работу сети."))
        items.add(iTem(2, "pc1","Топология компьютерной сети","тип Кольцевая","Кольцевая топология компьютерной сети предполагает замкнутое соединение устройств. Выход одного устройства соединяется с входом следующего. Данные двигаются по кругу. Отличается такая топология ненадобностью сервера, но выход одного устройства сети, «убивает» ВСЮ сеть"))
        items.add(iTem(3, "pc2","Топология компьютерной сети","тип Шинная","Шинная топология сети это параллельное подключение устройств сети к общему кабелю. Выход одного устройства из строя не влияет на работу сети, однако обрыв кабеля (шины) «вырубает» всю сеть."))

        itemList.layoutManager = LinearLayoutManager(this)
        itemList.adapter = iAdapter(items, this)
    }
}
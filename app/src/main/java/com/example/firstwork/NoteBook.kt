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

        items.add(iTem(1, "pc","Топология компьютерной сети","тип Звезда","Звезда - базовая топология компьютерной сети, в которой все компьютеры сети присоединены к центральному узлу (обычно коммутатор), образуя физический сегмент сети. Подобный сегмент сети может функционировать как отдельно, так и в составе сложной сетевой топологии (как правило, «дерево»). Весь обмен информацией идет исключительно через центральный компьютер или агрегат, на который таким способом возлагается очень большая нагрузка, поэтому ничем другим, кроме сети, он заниматься не может. Как правило, именно центральный компьютер или агрегат является самым мощным в сетевом отношении, и именно на него возлагаются все функции по управлению сетью и передаче данных.\n"))
        items.add(iTem(2, "pc1","Топология компьютерной сети","тип Кольцевая","Кольцо́ — топология, в которой каждый компьютер соединён линиями связи только с двумя другими: от одного он только получает информацию, а другому только передаёт. На каждой линии связи, как и в случае звезды, работает только один передатчик и один приёмник. Это позволяет отказаться от применения внешних терминаторов.\n" +
                "\n" +
                "Работа в сети кольца заключается в том, что каждый компьютер ретранслирует (возобновляет) сигнал, то есть выступает в роли повторителя, потому затухание сигнала во всём кольце не имеет никакого значения, важно только затухание между соседними компьютерами кольца. Чётко выделенного центра в этом случае нет, все компьютеры могут быть одинаковыми. Однако достаточно часто в кольце выделяется специальный абонент, который управляет обменом или контролирует обмен. Понятно, что наличие такого управляющего абонента снижает надёжность сети, потому что выход его из строя сразу же парализует весь обмен. "))
        items.add(iTem(3, "pc2","Топология компьютерной сети","тип Шинная","Топология общая шина предполагает использование одного кабеля, к которому подключаются все компьютеры сети. Отправляемое какой-либо рабочей станцией сообщение распространяется на все компьютеры сети. Каждая машина проверяет кому адресовано сообщение, — если сообщение адресовано ей, то обрабатывает его. Принимаются специальные меры для того, чтобы при работе с общим кабелем компьютеры не мешали друг другу передавать и принимать данные. Для того, чтобы исключить одновременную посылку данных, применяется либо «несущий» сигнал, либо один из компьютеров является главным и «даёт слово» остальным компьютерам такой сети. Например, в сетях Ethernet (IEEE 802.3) c шинной топологией станции прослушивают занятость среды и действуют по алгоритму CSMA/CD (англ. Carrier Sense Multiple Access with Collision Detection — множественный доступ с прослушиванием несущей и обнаружением столкновений)."))
        items.add(iTem(4, "pc3","Топология компьютерной сети","тип Ячеистая","Ячеистая топология (mesh-сеть) — сетевая топология компьютерной сети, построенная на принципе ячеек, в которой рабочие станции сети соединяются друг с другом и способны принимать на себя роль коммутатора для остальных участников. Данная организация сети является достаточно сложной в настройке, однако при такой топологии реализуется высокая отказоустойчивость. Как правило, узлы соединяются по принципу «каждый с каждым». Таким образом, большое количество связей обеспечивает широкий выбор маршрута трафика внутри сети — следовательно, обрыв одного соединения не нарушит функционирования сети в целом."))
        items.add(iTem(5, "pc4","Топология компьютерной сети","тип Смешанная","Смешанная топология сети — это комбинация различных видов топологий, таких как звезда, кольцо, шина и ячеистая структура. Она используется для объединения преимуществ разных схем подключения и повышения отказоустойчивости сети.\n" +
                "\uD83D\uDD39 Особенности смешанной топологии:\n" +
                "\n" +
                "    Позволяет гибко настраивать сеть в зависимости от потребностей.\n" +
                "    Повышает надежность за счет дублирования соединений.\n" +
                "    Может включать в себя разные уровни иерархии (например, звездообразная топология на одном уровне, а кольцевая – на другом).\n" +
                "\n" +
                "\uD83D\uDD39 Примеры смешанной топологии:\n" +
                "\n" +
                "1\uFE0F⃣ Древовидная топология (иерархическая)\n" +
                "\n" +
                "    Основана на топологии звезда, но соединяет несколько таких звезд в единую сеть.\n" +
                "    Пример: корпоративная сеть, где у каждого отдела своя подсеть.\n" +
                "\n" +
                "2\uFE0F⃣ Гибрид \"Звезда + Шина\"\n" +
                "\n" +
                "    Несколько звездообразных сетей соединены общей магистральной шиной.\n" +
                "    Пример: офисы разных этажей связаны общей магистралью."))
        items.add(iTem(6, "pc5","Топология компьютерной сети","Топология интернет","Начнем разбор топологии Интернет с «низшего» звена – компьютера Пользователя. Компьютер пользователя, через модем или напрямую, связывается с местным интернет - провайдером. Точка соединения компьютера пользователя с сервером провайдера, называют точкой присутствия или РОР - Point of Presence.\n" +
                "\n" +
                "В свою очередь, провайдер владеет своей местной сетью, состоящую из линий связи и маршрутизаторов. Пакеты данных получаемые провайдером передаются либо на хост провайдера, либо оператору сетевой магистрали. \n" +
                "\n" +
                "В свою очередь, операторы магистралей владеют своими международными магистральными сетями (высокоскоростными). Эти сети связывают между собой местных провайдеров. \n" +
                "\n" +
                "Хостинговые компании и крупные Интернет корпорации устраивают свои серверные фермы (дата центры), которые напрямую подключены к магистралям. \n" +
                "\n" +
                "Эти центры обрабатывают десятки тысяч запросов к веб-страницам в секунду. Как правило, дата-центры устраиваются в арендуемых помещениях магистральных \n" +
                "\n" +
                "МИ(р) 22-25"))



        itemList.layoutManager = LinearLayoutManager(this)
        itemList.adapter = iAdapter(items, this)
    }
}
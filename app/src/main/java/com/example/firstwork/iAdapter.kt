package com.example.firstwork

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class iAdapter(var items: List<iTem>, var context: Context) : RecyclerView.Adapter<iAdapter.MyViewHolder>() {

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image = view.findViewById<ImageView>(R.id.i_l_img)
        val title = view.findViewById<TextView>(R.id.i_l_tit)
        val desc = view.findViewById<TextView>(R.id.i_l_desc)
        val btn: Button = view.findViewById(R.id.i_l_b)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_in_list, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text = items[position].title
        holder.desc.text = items[position].desc


        var imageId = context.resources.getIdentifier(
            items[position].image,
            "drawable",
            context.packageName
        )

        holder.image.setImageResource(imageId)

        holder.btn.setOnClickListener {
            val intent = Intent(context, itemssAtivity::class.java)
            intent.putExtra("itemDesc", items[position].desc)
            intent.putExtra("itemText", items[position].text)
            context.startActivity(intent)


        }
    }
}


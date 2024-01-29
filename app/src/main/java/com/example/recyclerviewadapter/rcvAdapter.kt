package com.example.recyclerviewadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class rcvAdapter(val requiredContext : Context, private val phoneDetails: ArrayList<phonedetailsClass>) :
    RecyclerView.Adapter<rcvAdapter.phoneDetailsViewHolder>() {

    class phoneDetailsViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
         val personName : TextView = itemView.findViewById(R.id.item_text1)
        val personNumber : TextView = itemView.findViewById(R.id.item_text2)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): phoneDetailsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rcv_items,parent,false)
        return phoneDetailsViewHolder(view)
    }

    override fun getItemCount(): Int {
            return phoneDetails.size
    }

    override fun onBindViewHolder(holder: phoneDetailsViewHolder, position: Int) {
        holder.personName.text = phoneDetails[position].personName
        holder.personNumber.text = phoneDetails[position].personNumber.toString()
    }
}
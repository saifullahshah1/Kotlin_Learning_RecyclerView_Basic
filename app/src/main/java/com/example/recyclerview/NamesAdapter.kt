package com.example.recyclerview

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NamesAdapter(val NamesList: Array<String>): RecyclerView.Adapter<NamesAdapter.NamesViewHolder>(){


    class NamesViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        private val NamesTextView: TextView = itemView.findViewById(R.id.row_item)

        fun bind(name: String)
        {
            NamesTextView.text = name
        }
    }

    // Returns a new ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_item, parent, false)

        return NamesViewHolder(view)
    }

    // Returns size of data list
    override fun getItemCount(): Int {
        return NamesList.size
    }

    // Displays data at a certain position
    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        holder.bind(NamesList[position])
    }
}

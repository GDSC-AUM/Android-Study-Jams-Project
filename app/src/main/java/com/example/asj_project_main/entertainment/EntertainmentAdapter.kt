package com.example.asj_project_main.entertainment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.asj_project_main.databinding.ViewBinding
import com.example.asj_project_main.healthcare.CardViewHolder
import com.example.asj_project_main.healthcare.HealthMenuActivity

class EntertainmentAdapter(private val entertainment: List<entertainment>,
private val clickETListener: EntertainmentMenuActivity):
RecyclerView.Adapter<EntertainmentCardViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EntertainmentCardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding= ViewBinding.inflate(from,parent,false)
        return EntertainmentCardViewHolder(binding,clickETListener)
    }

    override fun onBindViewHolder(holder: EntertainmentCardViewHolder, position: Int) {
        holder.bindHealth(entertainment[position])
    }

    override fun getItemCount(): Int = entertainment.size
}
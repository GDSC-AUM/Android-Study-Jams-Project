package com.example.asj_project_main.morderntech

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.asj_project_main.databinding.ViewBinding

class MTAdapter (private val modernTech: List<modernTech>,
private val clickMTListener: ModernTechMenuActivity):
    RecyclerView.Adapter<ModernTechCardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModernTechCardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding= ViewBinding.inflate(from,parent,false)
        return ModernTechCardViewHolder(binding,clickMTListener)
    }

    override fun onBindViewHolder(holder: ModernTechCardViewHolder, position: Int) {
        holder.bindHealth(modernTech[position])
    }

    override fun getItemCount(): Int = modernTech.size
}
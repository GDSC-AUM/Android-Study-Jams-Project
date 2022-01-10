package com.example.asj_project_main.fitness

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.asj_project_main.healthcare.CardViewHolder
import com.example.asj_project_main.databinding.ViewBinding

class fitnessAdapter(private val fitness: List<fitness>,
                     private val clickFListener: FitnessMenuActivity
): RecyclerView.Adapter<fitnessCardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): fitnessCardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding= ViewBinding.inflate(from,parent,false)
        return fitnessCardViewHolder(binding,clickFListener)
    }

    override fun onBindViewHolder(holder: fitnessCardViewHolder, position: Int) {
        holder.bindHealth(fitness[position])
    }

    override fun getItemCount(): Int = fitness.size
}
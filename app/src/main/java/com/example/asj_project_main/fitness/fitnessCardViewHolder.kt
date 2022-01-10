package com.example.asj_project_main.fitness

import androidx.recyclerview.widget.RecyclerView
import com.example.asj_project_main.databinding.ViewBinding
import com.example.asj_project_main.healthcare.HealthMenuActivity
import com.example.asj_project_main.healthcare.healthcare

class fitnessCardViewHolder(
    private val viewBinding: ViewBinding,
    private val clickListener: FitnessMenuActivity
): RecyclerView.ViewHolder(viewBinding.root) {
    fun bindHealth(fitness: fitness){
        viewBinding.cover.setImageResource(fitness.cover)
        viewBinding.titleView.text = fitness.title

        viewBinding.cardView.setOnClickListener{
            clickListener.onClick(fitness)
        }
    }
}
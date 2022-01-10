package com.example.asj_project_main.morderntech

import androidx.recyclerview.widget.RecyclerView
import com.example.asj_project_main.databinding.ViewBinding
import com.example.asj_project_main.fitness.FitnessMenuActivity
import com.example.asj_project_main.healthcare.HealthMenuActivity
import com.example.asj_project_main.healthcare.healthcare

class ModernTechCardViewHolder (
    private val viewBinding: ViewBinding,
    private val clickMTListener: ModernTechMenuActivity
): RecyclerView.ViewHolder(viewBinding.root) {
    fun bindHealth(modernTech: modernTech){
        viewBinding.cover.setImageResource(modernTech.cover)
        viewBinding.titleView.text = modernTech.title

        viewBinding.cardView.setOnClickListener{
            clickMTListener.onClick(modernTech)
        }
    }
}
package com.example.asj_project_main.selfcare

import androidx.recyclerview.widget.RecyclerView
import com.example.asj_project_main.databinding.ViewBinding
import com.example.asj_project_main.healthcare.HealthMenuActivity
import com.example.asj_project_main.healthcare.healthcare

class SelfCareCardViewHolder (
    private val viewBinding: ViewBinding,
    private val clickSCListener: SelfCareMenuActivity
): RecyclerView.ViewHolder(viewBinding.root) {
    fun bindHealth(selfcare: selfcare){
        viewBinding.cover.setImageResource(selfcare.cover)
        viewBinding.titleView.text = selfcare.title

        viewBinding.cardView.setOnClickListener{
            clickSCListener.onClick(selfcare)
        }
    }
}
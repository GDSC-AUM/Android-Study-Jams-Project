package com.example.asj_project_main.entertainment

import androidx.recyclerview.widget.RecyclerView
import com.example.asj_project_main.databinding.ViewBinding
import com.example.asj_project_main.healthcare.HealthMenuActivity
import com.example.asj_project_main.healthcare.healthcare

class EntertainmentCardViewHolder (
    private val viewBinding: ViewBinding,
    private val clickETListener: EntertainmentMenuActivity
): RecyclerView.ViewHolder(viewBinding.root) {
    fun bindHealth(entertainment: entertainment){
        viewBinding.cover.setImageResource(entertainment.cover)
        viewBinding.titleView.text = entertainment.title

        viewBinding.cardView.setOnClickListener{
            clickETListener.onClick(entertainment)
        }
    }
}
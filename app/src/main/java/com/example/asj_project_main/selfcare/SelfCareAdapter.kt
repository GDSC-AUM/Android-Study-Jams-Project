package com.example.asj_project_main.selfcare

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.asj_project_main.databinding.ViewBinding
import com.example.asj_project_main.healthcare.CardViewHolder


class SelfCareAdapter(private val selfcare: MutableList<selfcare>,
                      private val clickSCListener: SelfCareMenuActivity)
    :RecyclerView.Adapter<SelfCareCardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelfCareCardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding= ViewBinding.inflate(from,parent,false)
        return SelfCareCardViewHolder(binding,clickSCListener)
    }

    override fun onBindViewHolder(holder: SelfCareCardViewHolder, position: Int) {
        holder.bindHealth(selfcare[position])
    }

    override fun getItemCount(): Int = selfcare.size
}
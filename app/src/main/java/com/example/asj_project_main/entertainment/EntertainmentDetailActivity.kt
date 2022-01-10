package com.example.asj_project_main.entertainment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asj_project_main.databinding.ActivityEntertainmentDetailBinding
import com.example.asj_project_main.healthcare.HEALTH_EXTRA
import com.example.asj_project_main.healthcare.healthcare
import com.example.asj_project_main.healthcare.healthcareList

class EntertainmentDetailActivity : AppCompatActivity() {
    private lateinit var binding : ActivityEntertainmentDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEntertainmentDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val healthId = intent.getIntExtra(ENTERTAINMENT_EXTRA,-1)
        val health = healthById(healthId)
        if(health!=null){
            binding.cover.setImageResource(health.cover)
            binding.scrollInfo.text = health.info
        }
    }

    private fun healthById(healthId:Int): entertainment? {
        for(health in entertainmentList){
            if (health.id == healthId)
                return health
        }
        return null

    }
}
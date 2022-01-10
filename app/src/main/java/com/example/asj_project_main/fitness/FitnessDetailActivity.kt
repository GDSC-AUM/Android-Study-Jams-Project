package com.example.asj_project_main.fitness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asj_project_main.databinding.ActivityFitnessDetailBinding
import com.example.asj_project_main.healthcare.HEALTH_EXTRA
import com.example.asj_project_main.healthcare.healthcare
import com.example.asj_project_main.healthcare.healthcareList

class FitnessDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFitnessDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFitnessDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val healthId = intent.getIntExtra(FITNESS_EXTRA,-1)
        val health = healthById(healthId)
        if(health!=null){
            binding.cover.setImageResource(health.cover)
            binding.scrollInfo.text = health.info
        }
    }

    private fun healthById(healthId:Int): fitness? {
        for(health in fitnessList){
            if (health.id == healthId)
                return health
        }
        return null

    }
}
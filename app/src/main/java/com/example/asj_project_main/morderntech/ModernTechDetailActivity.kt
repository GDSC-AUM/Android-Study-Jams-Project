package com.example.asj_project_main.morderntech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asj_project_main.databinding.ActivityModernTechDetailBinding
import com.example.asj_project_main.healthcare.HEALTH_EXTRA
import com.example.asj_project_main.healthcare.healthcare
import com.example.asj_project_main.healthcare.healthcareList

class ModernTechDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityModernTechDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityModernTechDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val healthId = intent.getIntExtra(MT_EXTRA,-1)
        val health = healthById(healthId)
        if(health!=null){
            binding.cover.setImageResource(health.cover)
            binding.scrollInfo.text = health.info
        }
    }

    private fun healthById(healthId:Int): modernTech? {
        for(health in modernTechList1){
            if (health.id == healthId)
                return health
        }
        return null

    }
}
package com.example.asj_project_main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asj_project_main.covidprec.CovidPrecautionActivity
import com.example.asj_project_main.databinding.ActivityMainBinding
import com.example.asj_project_main.entertainment.EntertainmentMenuActivity
import com.example.asj_project_main.fitness.FitnessMenuActivity
import com.example.asj_project_main.healthcare.HealthMenuActivity
import com.example.asj_project_main.morderntech.ModernTechMenuActivity
import com.example.asj_project_main.selfcare.SelfCareMenuActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.modernTech.setOnClickListener {
            val intent = Intent(this, ModernTechMenuActivity::class.java)
            startActivity(intent)
        }
        binding.healthCare.setOnClickListener {
            val intent = Intent(this, HealthMenuActivity::class.java)
            startActivity(intent)
        }
        binding.dailyReminder.setOnClickListener {
            //add something
        }
        binding.newsCard.setOnClickListener {
            val intent = Intent(this, News::class.java)
            startActivity(intent)
        }
        binding.fitness.setOnClickListener {
            val intent = Intent(this, FitnessMenuActivity::class.java)
            startActivity(intent)
        }
        binding.selfCare.setOnClickListener {
            val intent = Intent(this, SelfCareMenuActivity::class.java)
            startActivity(intent)
        }
        binding.entertainmentCard.setOnClickListener {
            val intent = Intent(this, EntertainmentMenuActivity::class.java)
            startActivity(intent)
        }
        binding.covidPrec.setOnClickListener {
            val intent = Intent(this, CovidPrecautions::class.java)
            startActivity(intent)
        }
        binding.userManual.setOnClickListener {
            //add something
        }
        binding.aboutUs.setOnClickListener {
            val intent = Intent(this, QuotesActivity::class.java)
            startActivity(intent)
            //add something
        }
    }
}
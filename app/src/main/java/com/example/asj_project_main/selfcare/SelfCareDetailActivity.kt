package com.example.asj_project_main.selfcare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asj_project_main.databinding.ActivitySelfCareDetailBinding

class SelfCareDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySelfCareDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelfCareDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
package com.example.asj_project_main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.asj_project_main.InjectorUtils
import com.example.asj_project_main.QuotesViewModel
import com.example.asj_project_main.QuotesViewModelFactory
import com.example.asj_project_main.QuoteRepository
import com.example.asj_project_main.R
import java.lang.StringBuilder
import java.time.chrono.Chronology.of


class QuotesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quotes)
    }


}
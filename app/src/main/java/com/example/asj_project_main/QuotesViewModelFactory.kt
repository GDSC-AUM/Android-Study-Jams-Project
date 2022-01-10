package com.example.asj_project_main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class QuotesViewModelFactory(private val quoteRepository: QuoteRepository)
    : ViewModelProvider.NewInstanceFactory(){


        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return QuotesViewModel(quoteRepository) as T
        }
}
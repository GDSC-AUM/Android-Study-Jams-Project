package com.example.asj_project_main

import androidx.lifecycle.ViewModel

class QuotesViewModel(private val quoteRepository: QuoteRepository)
        : ViewModel(){

            fun getQuotes() = quoteRepository.getQuotes()

            fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
    }
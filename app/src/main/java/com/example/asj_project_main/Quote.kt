package com.example.asj_project_main

data class Quote (val quoteText: String,
                  val author: String){
    override fun toString(): String {
        return "$quoteText - $author"
    }
}
package com.example.asj_project_main

class FakeDatabase private constructor() {

    var quoteDao = FakeQuoteDao()
        private set

    companion object{
        @Volatile private var instance: FakeDatabase? = null

        fun getInstance() =
            instance ?: synchronized(lock = this){
                instance ?: FakeDatabase().also { instance = it }
            }
    }
}
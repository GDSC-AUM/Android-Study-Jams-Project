package com.example.asj_project_main.fitness

import com.example.asj_project_main.healthcare.healthcare
import com.example.asj_project_main.healthcare.healthcareList

val FITNESS_EXTRA = "fitExtra"
var fitnessList = mutableListOf<fitness>()
class fitness (
    var cover: Int,
    var title:String,
    var info: String,
    val id: Int? = fitnessList.size
        )
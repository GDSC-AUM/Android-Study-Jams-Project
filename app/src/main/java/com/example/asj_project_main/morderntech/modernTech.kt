package com.example.asj_project_main.morderntech

import com.example.asj_project_main.fitness.fitness
import com.example.asj_project_main.fitness.fitnessList

val MT_EXTRA = "modernExtra"
var modernTechList1 = mutableListOf<modernTech>()

class modernTech (
    var cover: Int,
    var title:String,
    var info: String,
    val id: Int? = modernTechList1.size
)
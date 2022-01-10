package com.example.asj_project_main.selfcare


val SC_EXTRA = "scExtra"
var selfcareList = mutableListOf<selfcare>()

class selfcare(
    var cover: Int,
    var title:String,
    var info: String,
    val id: Int? = selfcareList.size
)
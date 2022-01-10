package com.example.asj_project_main.entertainment



val ENTERTAINMENT_EXTRA = "entertainExtra"
var entertainmentList = mutableListOf<entertainment>()
class entertainment (
    var cover: Int,
    var title:String,
    var info: String,
    val id: Int? = entertainmentList.size
)
package com.example.asj_project_main.news

import com.example.asj_project_main.R

class DataSourceNews {
    fun loadAffirmationsNews(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.news_1 , R.drawable.image0),
            Affirmation(R.string.news_2,R.drawable.image1),
            Affirmation(R.string.news_3,R.drawable.image0),
            Affirmation(R.string.news_4,R.drawable.image1),
            Affirmation(R.string.news_1,R.drawable.image0),
            Affirmation(R.string.news_2,R.drawable.image1),
            Affirmation(R.string.news_3,R.drawable.image1),
            Affirmation(R.string.news_4,R.drawable.image0),
            Affirmation(R.string.news_5,R.drawable.image1),
            Affirmation(R.string.news_1,R.drawable.image1)
        )
    }
}
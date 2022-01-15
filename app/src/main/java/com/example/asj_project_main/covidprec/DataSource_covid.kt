package com.example.asj_project_main.covidprec

import com.example.asj_project_main.R
import com.example.asj_project_main.news.Affirmation

class DataSource_covid {
    fun loadAffirmations_covid():List<Affirmation>{
        return listOf<Affirmation>(
            Affirmation(R.string.covid_1 , R.drawable.covid1),
            Affirmation(R.string.covid_2 , R.drawable.covid2),
            Affirmation(R.string.covid_3 , R.drawable.covid3),
            Affirmation(R.string.covid_4 , R.drawable.covid4),
            Affirmation(R.string.covid_5 , R.drawable.covid5),
            Affirmation(R.string.covid_6 , R.drawable.covid6),
            Affirmation(R.string.covid_7 , R.drawable.covid7),
            Affirmation(R.string.covid_8 , R.drawable.covid8),
            Affirmation(R.string.covid_9 , R.drawable.covid9)

        )
    }
}

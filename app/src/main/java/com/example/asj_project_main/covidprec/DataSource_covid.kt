package com.example.asj_project_main.covidprec

import com.example.asj_project_main.R
import com.example.asj_project_main.news.Affirmation

class DataSource_covid {
    fun loadAffirmations_covid():List<Affirmation>{
        return listOf<Affirmation>(
            Affirmation(R.string.covid_1 , R.drawable.image0),
            Affirmation(R.string.covid_2 , R.drawable.image0),
            Affirmation(R.string.covid_3 , R.drawable.image0),
            Affirmation(R.string.covid_4 , R.drawable.image0),
            Affirmation(R.string.covid_5 , R.drawable.image0),
            Affirmation(R.string.covid_6 , R.drawable.image0),
            Affirmation(R.string.covid_7 , R.drawable.image0),
            Affirmation(R.string.covid_8 , R.drawable.image0),
            Affirmation(R.string.covid_9 , R.drawable.image0)

        )
    }
}
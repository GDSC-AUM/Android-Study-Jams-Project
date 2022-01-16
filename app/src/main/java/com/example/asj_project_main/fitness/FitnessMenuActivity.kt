package com.example.asj_project_main.fitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.asj_project_main.R
import com.example.asj_project_main.databinding.ActivityFitnessBinding

class FitnessMenuActivity : AppCompatActivity() , fitnessClickListener{
    private lateinit var binding: ActivityFitnessBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityFitnessBinding.inflate(layoutInflater)
        setContentView(binding.root)
        healthcareinfo()
        val mainact = this
        binding.myView.apply{
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = fitnessAdapter(fitnessList,mainact)
        }
    }

    override fun onClick(fitness: fitness){
        val intent = Intent(applicationContext, FitnessDetailActivity::class.java)
        intent.putExtra(FITNESS_EXTRA,fitness.id)
        startActivity(intent)
    }


    private fun healthcareinfo() {
        val health1 = fitness(
            R.drawable.ic_fitness1,
            "Health Benefits of fitness",
            "The Health Benefits of Exercise in Older Adults \n\n" +
                    "Our biology changes as we get older, causing seniors to have different reasons for staying in shape than younger generations. Though physical fitness provides benefits at any age, the health perks physically fit seniors enjoy are more notable.\n" +
                    " Physicians and researchers say seniors should remain as active as possible, without overexerting one’s self. In older adults, exercise helps you live a longer, healthier, and more joyous life.\n\n" +
                    "Some of the benefits of exercising later in life include:\n" +
                    "1. Exercise improves balance\n" +
                    "Falling down is a much bigger deal for older adults than younger ones. Every 11 seconds, an older adult is admitted to an emergency room for a fall-related injury\n" +
                    "regular exercise reduces the likelihood of falling by 23%.\n\n" +
                    "2. Helps to prevent and counteract disease: \n" +
                    "Heart disease, osteoporosis, depression and diabetes are common diseases among older adults, and are often deadly. Fortunately, adopting a more active lifestyle can contribute to the prevention of these diseases, or reduce the unpleasant symptoms of these diseases if you already have them. If you are at-risk for disease, exercise may be the key to warding off an unpleasant condition.\n\n" +
                    "3. Improves brain function:\n" +
                    "One of the most remarkable developments in health science is the revelation that the mind and the body are much more closely linked. A healthy body likely means a healthy mind, and seniors that exercise on a regular basis have improved cognitive health\n" +
                    "More recently, a study from the Alzheimer’s Research & Prevention Foundation, regular exercise has been shown to reduce your risk of developing Alzheimer’s disease or dementia by nearly 50%.\n\n" +
                    "4. Social Engagement\n" +
                    "Whether you join a walking group, go to group fitness classes or visit a gardening club, exercise can be made into a fun social event. Maintaining strong social ties is important for aging adults to feel a sense of purpose and avoid feelings of loneliness or depression. Above all, the key is to find a form of exercise you love, and it will never feel like a chore again.\n" +
                    "\n"
        )
        fitnessList.add(health1)

        val health2 = fitness(
            R.drawable.ic_fitness2,
            "Best Exercises",
            "Physical activity can improve your balance, increase your strength, improve your mood, and help control conditions like diabetes, heart disease, osteoporosis, and depression. It can also lower your risk of developing some types of cancer.\n\n" +
                    "Doctors recommend these types of exercise for older adults:\n" +
                    "1. Chair yoga \n" +
                    "Chair Yoga is also one of the low-impact, low-stress types of exercises that helps improve mobility, muscle strength, flexibility, and balance in older adults.\n" +
                    "This yoga is one of the easiest and accessible types as it only requires a single chair to get started. Unlike the other forms of yoga, it provides less stress on your joints, bones, and muscles. In addition, chair yoga has also been proved to improve mental health in older adults. \n\n" +
                    "2. Pilates\n" +
                    "Pilates is a famous low-impact form of exercise that has been done by people centuries ago. In Pilates, core strength, concentration, and alignment are emphasized and involve mats, Pilate balls, and other accessories. Pilates help increases flexibility and core strength.\n\n" +
                    "Some great Pilate exercises for older adults include:\n" +
                    "\n" +
                    "Mermaid movement\n" +
                    "Side circles\n" +
                    "Step-ups\n" +
                    "Leg circle\n\n" +
                    "3. Walking\n" +
                    "Walking is unarguably the best way to keep yourself fit. Some brisk walking for at least thirty minutes a day can work wonders for your body. Walking is the least stressful and most effortless form of exercise. For a healthy lifestyle, healthcare experts advise at least 10,000 steps per day. However, if you find it hard to keep up with it, you can settle for less, but the key is to keep yourself in motion.\n" +
                    "\n" +
                    "Ideas for moderate walking sessions:\n" +
                    "\n" +
                    "Listen to an audiobook or playlist to keep yourself stimulated during walks.\n" +
                    "Find a moderate trail in your nearest park.\n" +
                    "Upload a step-tracking app to count your steps.\n\n" +
                    "4. Resistance band workouts\n" +
                    "Resistance bands are stretchy strips of rubber that add resistance to workouts with reduced stress on your body. Resistance band workouts are user-friendly, and accessible for beginners. This form of exercise is growing more popular among seniors because of the relatively cheap up-front costs of materials, which makes resistance band workouts ideal for at-home exercise. Additionally, these exercises are ideal for strengthening your core, which improves posture, mobility, and balance.\n" +
                    "\n" +
                    "Resistance band workouts for seniors include:\n" +
                    "\n" +
                    "Leg press\n" +
                    "Triceps press\n" +
                    "Lateral raise\n" +
                    "Bicep curl\n" +
                    "Band pull apart\n\n"
        )
        fitnessList.add(health2)
        val health3 = fitness(
            R.drawable.ic_fitness3,
            "Exercises to avoid",
            "Engaging in physical activity can reduce diabetes, strengthen the heart, and lower the risk of depression and a variety of other health issues. However, seniors need to take some precautions with exercise because their bodies tend to be more fragile than younger people’s bodies. An injury while exercising could take longer to heal or cause complications for an elderly person\n" +
                    "\n" +
                    "Here are few exercises to avoid: \n" +
                    "1. Long Runs\n" +
                    "The senior years are not the best time to start training for a marathon. Each step puts several times a person’s body weight on the knee and foot joints, which can lead to leg injuries that make mobility difficult. Seniors can get the cardiovascular benefits of lengthy runs by swimming\n\n" +
                    "2. Crunches\n" +
                    "The back becomes increasingly fragile with age, so crunches are quite risky for seniors. When done incorrectly, crunches can quickly cause painful injuries to the joints and muscles in the back. Even when done properly, the repetitive curving of the spine could cause some issues. Instead of doing crunches, seniors should try some simple planks and leg lifts to strengthen the core.\n\n" +
                    "3. Squats\n" +
                    "Squats pose several risks. If the knees go over the toes too far during a squat, excessive pressure is placed on the knee joints, which can greatly damage the sensitive joint, especially when trying squats with weights. For seniors with balance issues, squats are a particularly bad idea because it is easy to lose balance and fall over while trying to rise from a squat.\n\n" +
                    "4. Leg Presses\n" +
                    "Leg press machines are common in most gyms, but exercising on one of these machines can be extremely damaging for elderly people. The machine requires leaning back on a flat bench while pushing against a weight with the feet. This action flattens the natural arch of the spine, which could cause damage to the lumbar spinal discs. \n\n"
        )
        fitnessList.add(health3)
        val health4 = fitness(
            R.drawable.ic_fitness4,
            "Tips to stay motivated",
            "Physical activity is a great way for older adults to gain substantial health benefits and maintain independence. Try to make exercise a priority. Remember that being active is one of the most important things you can do each day to maintain and improve health. Try these tips to help you stay motivated to exercise.\n\n" +
                    "1. Find Simple Ways to Make Exercise Fun and Enjoyable\n" +
                    "Some people like to walk on a treadmill at the gym. Others find that kind of activity boring. The key to sticking with exercise is to make it interesting and enjoyable. Be creative. Do things you enjoy but pick up the pace. Do all four types of exercise—endurance, strength, balance, and flexibility. \n\n" +
                    "2. Find Ways to Fit Exercise into Your Day\n" +
                    "You are more likely to exercise if it’s a convenient part of your day. Try exercising first thing in the morning. Combine physical activity with a task that’s already part of your day, such as walking the dog or doing household chores. If you don’t have 30 minutes to be active, look for three 10-minute periods. As you progress, add more 10-minute sessions until you hit your goal!\n\n" +
                    "3. Make Exercise a Social Activity\n" +
                    "Many people agree that an “exercise buddy” keeps them going.\n" +
                    "\n" +
                    "- Take a walk during lunch with coworkers.\n" +
                    "- Try a dance class—salsa, tango, square dancing—it’s up to you.\n" +
                    "- Use family gatherings as a time to play team sports or do outdoor activities.\n" +
                    "Note: Be safe during COVID-19. Some of these activities may not be possible under current restrictions or advisable under CDC guidelines. Reach out to your local senior center or gym to see if they offer online exercise classes or exercise videos.\n\n" +
                    "4. Keep Track of Your Exercise Progress\n" +
                    "The best way to stay motivated is to measure and celebrate your successes:\n" +
                    "\n" +
                    "- Make an exercise and physical activity plan that works for you. (PDF, 201K)\n" +
                    "- Track your daily physical activity. (PDF, 135K)\n" +
                    "- Find new ways to increase your physical activity.\n" +
                    "- Keep track of your monthly progress to see improvement. (PDF, 206K)\n" +
                    "- Update your exercise plan as you progress.\n\n\n" +
                    "“Training gives us an outlet for suppressed energies created by stress and thus tones the spirit just as exercise conditions the body.”\n" +
                    "– Arnold Schwarzenegger\n\n"
        )
        fitnessList.add(health4)


    }
}
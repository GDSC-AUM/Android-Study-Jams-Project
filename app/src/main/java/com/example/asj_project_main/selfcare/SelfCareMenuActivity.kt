package com.example.asj_project_main.selfcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.asj_project_main.R
import com.example.asj_project_main.databinding.ActivitySelfCareMenuBinding
import com.example.asj_project_main.healthcare.*

class SelfCareMenuActivity : AppCompatActivity(), SelfCareClickListener {
    private lateinit var binding: ActivitySelfCareMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelfCareMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        healthcareinfo()
        val mainact = this
        binding.myView.apply{
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = SelfCareAdapter(selfcareList,mainact)
        }
    }

    override fun onClick(selfcare: selfcare) {
        val intent = Intent(applicationContext, SelfCareDetailActivity::class.java)
        intent.putExtra(SC_EXTRA,selfcare.id)
        startActivity(intent)
    }

    private fun healthcareinfo() {
        val health1 = selfcare(
            R.drawable.ic_selfcare1,
            "Importance of Self care",
            "Self-care is an important aspect of life one cannot overlook. Self-love is an undeniable part of everyone’s life.\n" +
                    "\n" +
                    "Having said that, older adults are increasingly prone to feeling deserted, leading them to acquire a solitary attitude. Additionally, they tend to display withdrawn and unsocial tendencies which eventually takes a toll on their mental and physical health.\n" +
                    "\n" +
                    "Such feelings are quite common among older adults but aren’t recommended for their overall health. A beneficial solution is to practice self-care. \n\n" +
                    "The two aspects of self care are\n" +
                    "\n" +
                    "⦁ SELF CARE OF THE BODY\n" +
                    "1.Taking care of your health by exercising regularly which can be any form of activity , be it walk, yoga, or even light weight training or doing daily household chores which bring about NEAT- Non Exercise Activity Training which is the exercise we do while working at home.\n" +
                    "2.Regular health checkups. It is essential to keep tab over your current health condition and take measures to prevent health issues in future.\n" +
                    "3. Taking your prescribed medicines regularly and on time.\n" +
                    "4.Balanced nutrition. Eating wholesome timely meals which includes fruits, vegetables, fibrous foods, whole grains and healthy fats along with adequate intake of water is important.\n" +
                    "\n" +
                    "Active body leads to energetic and independent life.\n\n" +
                    "SELF CARE OF MIND\n" +
                    "\n" +
                    "1. Get involved in social and community services.\n" +
                    "2. Spending adequate family time with children and grandchildren. Also keep meeting relatives and  old friends, make new friends.\n" +
                    "3. Practice mindfulness, meditation and self reflection.\n" +
                    "4. Indulge in arts, music, dance, drawing , gardening, reading or taking up a new hobby. Visiting places of interest like museums or going for outings like movies etc.\n\n"
        )
        selfcareList.add(health1)

        val health2 = selfcare(
            R.drawable.ic_selfcare2,
            "How to practice Self care?",
            "Self-care is simple enough to practice. All you need to do is keep at these little habits of self-care each day, and witness your life transforming for the best!\n" +
                    "\n" +
                    "1. Know it is acceptable to ask for help:\n" +
                    "As age increases, most people tend to depend on others more compared to previous years. This is a normal component of aging in place and can enhance relationships with your loved ones. If you need anything to be done beyond your reach, never hesitate to ask for help.\n\n" +
                    "2. Laugh more often:\n" +
                    "Laughing releases happy hormones in your system. Dopamine and serotonin are secreted in your system when you laugh more often and are generally happy and contented. This, in turn, causes your body to respond positively to the happenings in life.\n\n" +
                    "3. Meditate and exercise:\n" +
                    "Exercise sets your blood flow in motion. And meditation improves your mental health both for the short and the long term. Practice a 3-5-minute meditating session each day. Basic exercises like walking, stretching, and isometric exercises can be incorporated into your daily routine. This decreases stiffness in your joints and increases blood flow and circulation which improves your overall health too.\n\n" +
                    "4. Diet and eating habits:\n" +
                    "With increasing age, you need to focus on your diet more than before. Schedules including eating habits is helpful, specifically if you take medications. Make sure you include plenty of fiber, proteins, and simple carbs in your food. Stay away from processed, sugary, and fatty ingredients.\n\n" +
                    "5. Sleeping habits:\n" +
                    "Sleeping relaxes our bodies. Hormones that induce hunger and satiate our appetite, ghrelin a and leptin, are secreted while you’re at rest. This helps keep your appetite regulated. When you pay attention to your sleep cycle consciously, you are helping your body heal and recover. \n\n"
        )
        selfcareList.add(health2)
        val health3 = selfcare(
            R.drawable.ic_selfcare3,
            "Mental Health",
            "Old age is a natural phenomenon and comes with its own set of challenges.  As the elder population is increasing, their traditional nurturing and life-sustaining influences are slowly becoming less effective. Depression, dementia, and anxiety are commonly seen in old age and have an effect on senior’s mental health and well-being.\n" +
                    "Older adults, those aged 60 or above, make important contributions to society as family members, volunteers and as active participants in the workforce.\n" +
                    " While most have good mental health, many older adults are at risk of developing mental disorders, neurological disorders or substance use problems as well as other health conditions such as diabetes, hearing loss, and osteoarthritis\n" +
                    "\n" +
                    "Causes for Senior Mental Illness:\n" +
                    "One of the continuing problem with diagnosis and treatment of mental illness in elderly people is that they are more likely to report physical symptoms than psychiatric complaints.\n\n" +
                    "Symptoms of Mental Illness:\n" +
                    "There are numerous warning signs, which could indicate a mental health concern in older people:\n" +
                    "1. Sad or miserable mood lasting longer than two weeks.\n" +
                    "2. Social withdrawal, loss of interest in things that used to be pleasurable.\n" +
                    "3. Unexplained fatigue, energy loss, or sleep alterations.\n" +
                    "4. Confusion, disorientation, problems with concentration or decision-making.\n" +
                    "5. Increase or decrease in hunger, changes in weight.\n" +
                    "6. Memory loss, especially recent or short-term memory problems.\n\n" +
                    "The problem of mental health and the psychiatric problem needs to be tackled with the utmost care and a multidisciplinary approach needs to be followed. Providing a safe community for elders is very much needed in our society, and steps need to be taken to promote physical and mental well-being for the elders of our country.\n" +
                    "\n\n" +
                    "“Each time you set a healthy boundary, you say “yes” to more freedom”-  Nancy Levin\n\n"
        )
        selfcareList.add(health3)
        val health4 = selfcare(
            R.drawable.ic_medical,
            "Medical Informations",
            "Health problems are one of the very common and very important factors which our elder’s face in the second inning of their life.\n" +
                    "Most Common Health issues faced:\n\n" +
                    "1. Arthritis\n" +
                    "The word arthritis is used to describe pain, swelling and stiffness in a joint or joints. Arthritis isn’t a single condition and there are several different types. \n" +
                    "Osteoarthritis (OA) is the most common type of arthritisTrusted Source,  Other common typesTrusted Source include:\n" +
                    "\n\n" +
                    "Symptoms:\n" +
                    "* clicking or popping with bending\n" +
                    "* muscle weakness around the joint\n" +
                    "* instability or buckling of the joint\n" +
                    "* bony growths in the fingers\n\n" +
                    "What causes Arthritis?\n" +
                    "age (OA is most common in adults over age 50), obesity, autoimmune disorders, genes or family history, muscle weakness\n\n\n" +
                    "2. Heart Disease\n" +
                    "Heart Disease\n" +
                    "According to the CDC, heart disease remains the leading killer of adults over age 65, accounting for 489,722 deaths in 2014. As a chronic condition, heart disease affects 37 percent of men and 26 percent of women 65 and older\n" +
                    "\n\n" +
                    "Symptoms:\n" +
                    "* Chest pain, chest tightness, chest pressure and chest discomfort (angina)\n" +
                    "* Shortness of breath\n" +
                    "* Pain, numbness, weakness or coldness in your legs or arms if the blood vessels in those parts of your body are narrowed\n" +
                    "* Pain in the neck, jaw, throat, upper abdomen or back\n\n" +
                    "Causes:\n" +
                    "Heart disease causes depend on your specific type of heart disease. There are many different types of heart disease, Make sure to visit a doctor if you witness theses symptoms\n" +
                    "\n\n" +
                    "3. Cancer\n" +
                    "Cancer is the second leading cause of death among people over age 65, with 413,885. If caught early through screenings, such as mammograms, colonoscopies, and skin checks, many types of cancer are treatable. And though you're not always able to prevent cancer, you can improve your quality of life as a senior living with cancer\n\n" +
                    "Symptoms:\n" +
                    "Here are some of the more common signs and symptoms that may be caused by cancer. However, any of these can be caused by other problems as well.\n" +
                    "\n" +
                    "* Fatigue or extreme tiredness that doesn’t get better with rest.\n" +
                    "* Weight loss or gain of 10 pounds or more for no known reason\n" +
                    "* Eating problems such as not feeling hungry, trouble swallowing, belly pain, or nausea and vomiting\n" +
                    "* Swelling or lumps anywhere in the body\n" +
                    "* Thickening or lump in the breast or other part of the body\n" +
                    "* Change in bowel habits, such as constipation or diarrhea, that doesn’t go away or a change in how your stools look\n" +
                    "* Bladder changes such as pain when passing urine, blood in the urine or needing to pass urine more or less often\n" +
                    "\n\n" +
                    "4. Amnesia\n" +
                    "Amnesia is a form of memory loss.\n" +
                    "\n" +
                    "Some people with amnesia have difficulty forming new memories. Others can’t recall facts or past experiences. People with amnesia usually retain knowledge of their own identity in addition to their motor skills.\n" +
                    "\n" +
                    "Mild memory loss is a normal part of aging.\n\n" +
                    "Symptoms:\n" +
                    "* difficulty recalling facts, events, places, or specific details (which can range from what you ate this morning to the name of the current president)\n" +
                    "* an impaired ability to learn new information\n" +
                    "* confusion\n" +
                    "* an inability to recognize locations or faces\n\n\n" +
                    "5. Diabetes\n" +
                    "Diabetes is a chronic (long-lasting) health condition that affects how your body turns food into energy.,If you have diabetes, your body either doesn’t make enough insulin or can’t use the insulin it makes as well as it should.\n" +
                    "There isn’t a cure yet for diabetes, but losing weight, eating healthy food, and being active can really help.\n\n" +
                    "Symptoms:\n" +
                    "* Are very hungry\n" +
                    "* Have blurry vision\n" +
                    "* Have numb or tingling hands or feet\n" +
                    "* Feel very tired\n" +
                    "* Have very dry skin\n" +
                    "* Have sores that heal slowly\n" +
                    "* Have more infections than usual\n\n\n" +
                    "For more enquiries always visit a doctor and get the best medication and treatment prescribed.\n"
        )
        selfcareList.add(health4)
        val health5 = selfcare(
            R.drawable.ic_outdoor,
            "Outdoor Activities",
            "Why Should Seniors Engage in Outings?\n" +
                    "Many seniors tend to stay indoors due to their physical limitations or lifestyle changes. Getting out and about with a wheelchair can seem like a tremendous burden, and a lack of a regular job erases any essential need to get outside regularily.\n" +
                    "\n" +
                    "However, remaining at home – often alone – can contribute to ailing health, depression, and memory loss. \n" +
                    "Outdoor Activities for Seniors\n" +
                    "Now that you know how to prepare for an outdoor activity with seniors, let’s look at some of the best places to go. \n" +
                    "\n"+"1. Shopping\n" +
                    "Taking a walk around the mall and window shopping can be quite enjoyable. Malls typically have plenty of benches where you or an older adult can rest if they need to. \n" +
                    "\n"+"2. Bird Watching\n" +
                    "If you want to avoid uneven ground and walkways, try bird watching.There are many avid older birders, so birding can prove to be a good socializing activity as well\n" +
                    "\n"+"3. Gardening\n" +
                    "Gardening can make a good exercise or a simple form of relaxation. It maintains their flexibility, strength, and allows them to stay active. Moreover, gardening of crops can even be a fruitful source of food.\n" +
                    "\n"+"4. Golf\n" +
                    "Golf is known as a good and entertaining way to spend time outdoors. It is also a relaxing activity for some, and it helps them improve their coordination. It might look like a simple sport, but golfing also provides light exercises that every senior needs.\n" +
                    "\n"+"5. Picnic\n" +
                    "A picnic, however elaborate or simple it might be, is a good way to bask under the sun and soak up that much-needed Vitamin D. It is also a form of social activity that will allow seniors to have conversations with their friends, or even caregivers.\n\n"
        )
        selfcareList.add(health5)
        val health6 =selfcare(
            R.drawable.ic_covid_19,
            "Information on Covid-19",
            "What is Covid - 19? \n" +
                    "Coronavirus disease (COVID-19) is an infectious disease caused by the SARS-CoV-2 virus.The virus can spread from an infected person’s mouth or nose in small liquid particles when they cough, sneeze, speak, sing or breathe.\n" +
                    "\n" +
                    "-- Symptoms\n" +
                    "Most common symptoms:\n" +
                    "fever\n" +
                    "cough\n" +
                    "tiredness\n" +
                    "loss of taste or smell.\n\n" +
                    "Less common symptoms:\n" +
                    "sore throat\n" +
                    "headache\n" +
                    "aches and pains\n" +
                    "diarrhoea\n" +
                    "a rash on skin, or discolouration of fingers or toes\n" +
                    "red or irritated eyes.\n\n" +
                    "-- Prevention\n" +
                    "# Get vaccinated when a vaccine is available to you.\n" +
                    "# Stay at least 1 metre apart from others, even if they don’t appear to be sick.\n" +
                    "# Wear a properly fitted mask when physical distancing is not possible or when in poorly ventilated settings.\n" +
                    "# Choose open, well-ventilated spaces over closed ones. Open a window if indoors.\n" +
                    "# Wash your hands regularly with soap and water or clean them with alcohol-based hand rub.\n" +
                    "# Cover your mouth and nose when coughing or sneezing.\n" +
                    "# If you feel unwell, stay home and self-isolate until you recover.\n" +
                    "Seek immediate medical attention if you have serious symptoms.  Always call before visiting your doctor or health facility. \n\n\n" +
                    "STAY SAFE AND TAKE CARE! \n"
        )
        selfcareList.add(health6)
    }
}
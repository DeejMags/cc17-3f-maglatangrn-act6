package com.example.a30daysappcc17_3fmaglatangrodrigo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a30daysappcc17_3fmaglatangrodrigo.adapter.Tip
import com.example.a30daysappcc17_3fmaglatangrodrigo.adapter.TipAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var tipAdapter: TipAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val tips = listOf(
            Tip("Day 1", R.drawable.outdoor, "Spend 15 minutes outdoors", "Take a walk or stroll in your neighborhood."),
            Tip("Day 2", R.drawable.podcast, "Listen to a new podcast", "Explore a new topic or genre."),
            Tip("Day 3", R.drawable.new_hobby, "Try a new hobby", "Pick up a new hobby like painting or knitting."),
            Tip("Day 4", R.drawable.healthy_meal, "Eat a healthy meal", "Cook something nutritious and delicious."),
            Tip("Day 5", R.drawable.meditation, "Do 10 minutes of meditation", "Take time to focus on your breath and relax."),
            Tip("Day 6", R.drawable.loved_one, "Call a loved one", "Reach out to someone you haven’t talked to in a while."),
            Tip("Day 7", R.drawable.sample_image7, "Read a chapter of a book", "Enjoy a chapter from a book you’ve been meaning to read."),
            Tip("Day 8", R.drawable.sample_image8, "Stretch for 5 minutes", "Do simple stretches to relax your muscles."),
            Tip("Day 9", R.drawable.sample_image9, "Take a 20-minute nap", "Recharge by napping during the day."),
            Tip("Day 10", R.drawable.sample_image10, "Write in a journal", "Reflect on your day or jot down your thoughts."),
            Tip("Day 11", R.drawable.sample_image11, "Declutter a small space", "Clean up a cluttered area like your desk or a drawer."),
            Tip("Day 12", R.drawable.sample_image12, "Watch a TED Talk", "Get inspired by watching a motivational TED Talk."),
            Tip("Day 13", R.drawable.sample_image13, "Take a long bath", "Relax with a calming bath."),
            Tip("Day 14", R.drawable.sample_image14, "Walk in nature", "Find a nearby park or green area to enjoy nature."),
            Tip("Day 15", R.drawable.sample_image15, "Practice deep breathing", "Try deep breathing exercises to calm your mind."),
            Tip("Day 16", R.drawable.sample_image16, "Drink 8 glasses of water", "Stay hydrated by drinking plenty of water."),
            Tip("Day 17", R.drawable.sample_image17, "Unplug from social media", "Take a break from social media for a day."),
            Tip("Day 18", R.drawable.sample_image18, "Watch a documentary", "Learn something new by watching an educational documentary."),
            Tip("Day 19", R.drawable.sample_image19, "Plan a fun weekend activity", "Think ahead and plan something fun for the weekend."),
            Tip("Day 20", R.drawable.sample_image20, "Do 30 minutes of exercise", "Get active with a workout or a long walk."),
            Tip("Day 21", R.drawable.sample_image21, "Listen to relaxing music", "Find calming music to unwind."),
            Tip("Day 22", R.drawable.sample_image22, "Make a gratitude list", "Write down things you’re grateful for."),
            Tip("Day 23", R.drawable.sample_image23, "Learn a new skill", "Challenge yourself to learn something new today."),
            Tip("Day 24", R.drawable.sample_image24, "Try a new recipe", "Cook a meal you’ve never made before."),
            Tip("Day 25", R.drawable.sample_image25, "Watch your favorite movie", "Revisit a film that brings you joy."),
            Tip("Day 26", R.drawable.sample_image26, "Try a digital detox", "Unplug from all devices for a few hours."),
            Tip("Day 27", R.drawable.sample_image27, "Write a letter", "Write a letter to someone you care about."),
            Tip("Day 28", R.drawable.sample_image28, "Do a random act of kindness", "Help someone out or do something kind for a stranger."),
            Tip("Day 29", R.drawable.sample_image29, "Try yoga", "Give yoga a try with an online tutorial or in-person class."),
            Tip("Day 30", R.drawable.sample_image30, "Reflect on your month", "Look back on your wellness journey and see how far you've come.")
        )

        tipAdapter = TipAdapter(tips)
        recyclerView.adapter = tipAdapter
    }
}

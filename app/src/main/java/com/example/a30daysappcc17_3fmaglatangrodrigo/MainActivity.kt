package com.example.a30daysappcc17_3fmaglatangrodrigo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a30daysappcc17_3fmaglatangrodrigo.adapter.TipAdapter
import com.example.a30daysappcc17_3fmaglatangrodrigo.data.Tip // Ensure this import is correct

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
            Tip("Day 6", R.drawable.loved_one, "Call a loved one", "Reach out to someone you haven’t talked to in a while.")
        )

        tipAdapter = TipAdapter(tips)

        recyclerView.adapter = tipAdapter
    }
}
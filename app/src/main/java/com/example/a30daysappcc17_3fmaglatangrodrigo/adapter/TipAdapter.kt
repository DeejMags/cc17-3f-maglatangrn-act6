package com.example.a30daysappcc17_3fmaglatangrodrigo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a30daysappcc17_3fmaglatangrodrigo.R
import com.example.a30daysappcc17_3fmaglatangrodrigo.data.Tip

class TipAdapter(private val tips: List<Tip>) : RecyclerView.Adapter<TipAdapter.TipViewHolder>() {

    class TipViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tipImage: ImageView = itemView.findViewById(R.id.tip_image)
        val tipTitle: TextView = itemView.findViewById(R.id.tip_title)
        val tipShortDescription: TextView = itemView.findViewById(R.id.tip_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_main, parent, false)
        return TipViewHolder(view)
    }

    override fun onBindViewHolder(holder: TipViewHolder, position: Int) {
        val tip = tips[position]
        holder.tipImage.setImageResource(tip.imageResId)
        holder.tipTitle.text = tip.title
        holder.tipShortDescription.text = tip.description
    }

    override fun getItemCount() = tips.size
}
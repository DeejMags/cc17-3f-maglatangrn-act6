package com.example.a30daysappcc17_3fmaglatangrodrigo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class Tip(
    val day: String,
    val imageResId: Int,
    val title: String,
    val description: String
)

class TipAdapter(private val tips: List<Tip>) : RecyclerView.Adapter<TipAdapter.TipViewHolder>() {

    inner class TipViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dayTextView: TextView = itemView.findViewById(R.id.tip_day)
        val imageView: ImageView = itemView.findViewById(R.id.tip_image)
        val titleTextView: TextView = itemView.findViewById(R.id.tip_title)
        val descriptionTextView: TextView = itemView.findViewById(R.id.tip_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_tip, parent, false)
        return TipViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TipViewHolder, position: Int) {
        val currentTip = tips[position]
        holder.dayTextView.text = currentTip.day
        holder.imageView.setImageResource(currentTip.imageResId)
        holder.titleTextView.text = currentTip.title
        holder.descriptionTextView.text = currentTip.description
    }

    override fun getItemCount() = tips.size
}
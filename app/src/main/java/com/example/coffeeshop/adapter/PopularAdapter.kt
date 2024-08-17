package com.example.coffeeshop.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.coffeeshop.activity.DetailedActivity
import com.example.coffeeshop.databinding.ViewholderPopularBinding
import com.example.coffeeshop.model.CategoryModel
import com.example.coffeeshop.model.ItemsModel

class PopularAdapter(val items: MutableList<ItemsModel>) :
    RecyclerView.Adapter<PopularAdapter.ViewHolder>() {

    private var context: Context? = null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularAdapter.ViewHolder {
        context = parent.context
        val binding = ViewholderPopularBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(binding)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: PopularAdapter.ViewHolder, position: Int) {
        val item = items[position]

        holder.binding.titleTxt.text = item.title
        holder.binding.priceTxt.text = "$" + item.price.toString()
        holder.binding.ratingBar.rating = item.rating.toFloat()
        holder.binding.extraTxt.text = item.extra

        Glide.with(holder.itemView.context)
            .load(item.picUrl[0])
            .into(holder.binding.shapeableImageView)

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailedActivity::class.java)
            intent.putExtra("object", item)
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int = items.size

    inner class ViewHolder(val binding: ViewholderPopularBinding) :
        RecyclerView.ViewHolder(binding.root)
}
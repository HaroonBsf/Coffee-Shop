package com.example.coffeeshop.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.coffeeshop.R
import com.example.coffeeshop.databinding.ViewholderSizeBinding

class SizeAdapter(val context: Context, val items: MutableList<String>) :
    RecyclerView.Adapter<SizeAdapter.ViewHolder>() {


    private var selectedPosition = -1
    private var lastSelectedPosition = -1


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SizeAdapter.ViewHolder {
        val binding =
            ViewholderSizeBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(binding)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: SizeAdapter.ViewHolder, position: Int) {
        holder.binding.root.setOnClickListener {
            lastSelectedPosition = selectedPosition
            selectedPosition = position
            notifyItemChanged(lastSelectedPosition)
            notifyItemChanged(selectedPosition)
        }
        if (selectedPosition == position) {
            holder.binding.coffee.setBackgroundResource(R.drawable.orange_bg)
        } else {
            holder.binding.coffee.setBackgroundResource(R.drawable.size_bg)
        }
        val imageSize = when (position) {
            0 -> 45.dpToPx(context)
            1 -> 50.dpToPx(context)
            2 -> 55.dpToPx(context)
            3 -> 65.dpToPx(context)
            else -> 70.dpToPx(context)
        }
        val layoutParam = holder.binding.coffee.layoutParams
        layoutParam.width = imageSize
        layoutParam.height = imageSize
        holder.binding.coffee.layoutParams = layoutParam

    }

    private fun Int.dpToPx(context: Context): Int {
        return (this * context.resources.displayMetrics.density).toInt()
    }

    override fun getItemCount(): Int = items.size

    inner class ViewHolder(val binding: ViewholderSizeBinding) :
        RecyclerView.ViewHolder(binding.root)
}
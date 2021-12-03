package com.example.myapplication.ui.flat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.ItemCategoryBinding
import com.example.myapplication.ui.flat.MockData.Companion.getItemList

class FlatAdapter: RecyclerView.Adapter<FlatAdapter.categoryHolder>() {
    val category_list = getItemList()
    var onItemClick : (() -> Unit)? = null
    inner class categoryHolder(item: View): RecyclerView.ViewHolder(item) {
        init{
            itemView.setOnClickListener {
                onItemClick?.invoke()
            }
        }
        val binding = ItemCategoryBinding.bind(item)
        fun bind(card: CategoryData) = with(binding){
            image.setImageResource(card.img)
            categoryType.text = card.category
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): categoryHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        return categoryHolder(view)
    }

    override fun onBindViewHolder(holder: categoryHolder, position: Int) {
        holder.bind(category_list[position])
    }

    override fun getItemCount(): Int {
        return category_list.size
    }
}
package com.example.myapplication.ui.house

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.ItemCategoryBinding
import com.example.myapplication.ui.house.MockData.Companion.getItemList

class HouseAdapter: RecyclerView.Adapter<HouseAdapter.categoryHolder>() {
    val category_list = getItemList()
    var onItemClick : ((Int) -> Unit)? = null
    inner class categoryHolder(item: View): RecyclerView.ViewHolder(item) {
        init{ //to get position of adapter, inside of invoke we call adapterPosition
            itemView.setOnClickListener {
                onItemClick?.invoke(adapterPosition)
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
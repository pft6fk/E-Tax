package com.example.myapplication.ui.house.categories.dir.info

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.ItemInfoBinding
import com.example.myapplication.ui.house.categories.dir.info.MockInfoData.Companion.takeInfo


class InfoAdapter:RecyclerView.Adapter<InfoAdapter.Holder>() {
    var onItemClick: (() -> Unit)? = null
    val info_list = takeInfo()

    inner class Holder(item: View): RecyclerView.ViewHolder(item) {
        init {
            itemView.setOnClickListener {
                onItemClick?.invoke()
            }
        }

            val binding = ItemInfoBinding.bind(item)
            fun connect(data: InfoData) = with(binding){
                typeData.text = data.type
                infoContent.text = data.data
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_info, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.connect(info_list[position])
    }

    override fun getItemCount(): Int {
        return info_list.size
    }



}



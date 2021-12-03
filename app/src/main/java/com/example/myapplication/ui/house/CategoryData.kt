package com.example.myapplication.ui.house

import com.example.myapplication.R

data class CategoryData(val img: Int, val category: String)

class MockData {
    companion object {
        fun getItemList(): List<CategoryData> {
            val data = ArrayList<CategoryData>()
            data.add(CategoryData(R.drawable.light_bulb,"Свет"))
            data.add(CategoryData(R.drawable.fire,"Газ"))
            data.add(CategoryData(R.drawable.cold_water,"Холодная вода"))
            data.add(CategoryData(R.drawable.garbage,"Твёрдобытовые отходы (Мусор)"))
            data.add(CategoryData(R.drawable.land,"Налог на землю"))

            return data
        }
    }
}

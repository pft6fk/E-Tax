package com.example.myapplication.ui.flat

import com.example.myapplication.R

data class CategoryData(val img: Int, val category: String)

class MockData {
    companion object {
        fun getItemList(): List<CategoryData> {
            val data = ArrayList<CategoryData>()
            data.add(CategoryData(R.drawable.light_bulb,"Свет"))
            data.add(CategoryData(R.drawable.fire,"Газ"))
            data.add(CategoryData(R.drawable.heating,"Отопление"))
            data.add(CategoryData(R.drawable.cold_water,"Холодная вода"))
            data.add(CategoryData(R.drawable.hot_water,"Горячая вода"))
            data.add(CategoryData(R.drawable.land,"Имущественный налог"))
            data.add(CategoryData(R.drawable.garbage,"Твёрдобытовые отходы (Мусор)"))
            data.add(CategoryData(R.drawable.house_tax,"ТЧСЖ"))

            return data
        }
    }
}

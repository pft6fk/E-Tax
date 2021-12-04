package com.example.myapplication.ui.flat.categories.dir.info

import com.example.myapplication.ui.house.categories.dir.info.InfoData

data class InfoData(val type: String, val data: String)

class MockInfoData(){
    companion object{
        fun takeInfo():List<InfoData>{
            val data = ArrayList<InfoData>()
            data.add(InfoData("Ф.И.О", "Акрамов Ф. У."))
            data.add(InfoData("Адрес", "ул. Длкаш, дом 34\nкв. 45"))
            data.add(InfoData("Остаток", "54 321.50 сум"))
            data.add(InfoData("Показатель счётчика", "12 345"))
            data.add(InfoData("Последний платёж", "100 000,00 сум\n05.12.2021"))
            data.add(InfoData("Оплачено до", "45 652 КВт"))
            data.add(InfoData("Тариф", "295 сум"))
            return data
        }
    }
}

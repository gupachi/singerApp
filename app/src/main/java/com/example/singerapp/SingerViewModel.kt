package com.example.singerapp

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

data class SingerData(val name: String, val example: String)

class SingerViewModel : ViewModel() {
    private val singerDataList = listOf(
        SingerData("더보이즈", "2017년 12월 6일에 데뷔한 IST엔터테인먼트 소속 11인조 다국적 보이그룹."),
        SingerData("스트레이키즈", "2018년 3월 25일에 데뷔한 JYP엔터테인먼트 소속의 8인조 다국적 보이그룹이다."),
        SingerData("에이티즈", "2018년 10월 24일에 데뷔한 KQ 엔터테인먼트 소속 8인조 보이그룹.")
    )

    private val _name = MutableLiveData<String>()
    val name: LiveData<String> = _name

    private val _example = MutableLiveData<String>()
    val example: LiveData<String> = _example

    fun updateData(index: Int) {
        val data = singerDataList.getOrNull(index)
        if (data != null) {
            Log.d("SingerViewModel", "Updating data: ${data.name}, ${data.example}")
            _name.value = data.name
            _example.value = data.example
        } else {
            Log.d("SingerViewModel", "No data found for index: $index")
        }
    }
}

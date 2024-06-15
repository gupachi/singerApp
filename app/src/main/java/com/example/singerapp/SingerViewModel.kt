package com.example.singerapp

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

data class SingerData(val name: String, val example: String)

class SingerViewModel : ViewModel() {
    private val singerDataList = listOf(
        SingerData("ateez", "Example 1"),
        SingerData("the boys", "Example 2"),
        SingerData("nct 127", "Example 3")
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
//package com.example.singerapp
//
//import android.util.Log
//import androidx.lifecycle.LiveData
//import androidx.lifecycle.MutableLiveData
//import androidx.lifecycle.ViewModel
//
//data class SingerData(val name: String, val example: String)
//
//class SingerViewModel : ViewModel() {
//    private val singerDataList = listOf(
//        SingerData("ateez", "Example 1"),
//        SingerData("the boys", "Example 2"),
//        SingerData("nct 127", "Example 3")
//    )
//
//    private val _name = MutableLiveData<String>()
//    val name: LiveData<String> = _name
//
//    private val _example = MutableLiveData<String>()
//    val example: LiveData<String> = _example
//
//    fun updateData(index: Int) {
//        val data = singerDataList.getOrNull(index)
//        if (data != null) {
//            Log.d("SingerViewModel", "Updating data: ${data.name}, ${data.example}")
//            _name.value = data.name
//            _example.value = data.example
//        } else {
//            Log.d("SingerViewModel", "No data found for index: $index")
//        }
//    }
//}
package com.example.singerapp


import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.singerapp.data.Singer
import com.example.singerapp.data.SingerDatabase
import com.example.singerapp.data.SingerRepository
import kotlinx.coroutines.launch

class SingerViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: SingerRepository
    val allSingers: LiveData<List<Singer>>

    init {
        val singerDao = SingerDatabase.getDatabase(application).singerDao()
        repository = SingerRepository(singerDao)
        allSingers = repository.allSingers
    }

    fun insert(singer: Singer) = viewModelScope.launch {
        repository.insert(singer)
    }

    fun updateData(index: Int) {
        // Room에서 데이터를 가져오고 업데이트하는 로직으로 변경
        val singers = allSingers.value
        if (singers != null && index in singers.indices) {
            val data = singers[index]
            _name.value = data.name
            _example.value = data.example
        }
    }

    private val _name = MutableLiveData<String>()
    val name: LiveData<String> = _name

    private val _example = MutableLiveData<String>()
    val example: LiveData<String> = _example
}

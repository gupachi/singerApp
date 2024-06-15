import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

data class SingerData(val name: String, val example: String)

class SingerViewModel(private val itemDao: SingerItemDao) : ViewModel() {
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
            _name.value = data.name
            _example.value = data.example
        }
    }
}
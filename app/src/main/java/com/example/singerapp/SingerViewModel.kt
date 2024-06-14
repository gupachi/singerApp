import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SingerViewModel : ViewModel() {
    private val _name = MutableLiveData<String>()
    val name: LiveData<String> get() = _name

    private val _example = MutableLiveData<String>()
    val example: LiveData<String> get() = example

    init {
        _name.value = "Default Name"
        _example.value = "Default Example"
    }

    fun updateData(newName: String, newExample: String) {
        _name.value = newName
        _example.value = newExample
    }
}

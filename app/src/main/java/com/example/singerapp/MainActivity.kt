import android.os.Bundle
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.singerapp.R
import com.example.singerapp.Singer1Fragment
import com.example.singerapp.Singer2Fragment
import com.example.singerapp.Singer3Fragment


class MainActivity : AppCompatActivity() {

    private val viewModel: SingerViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_fragment_one -> {
                viewModel.updateData("Name 1", "Example 1")
                replaceFragment(Singer1Fragment())
                true
            }
            R.id.menu_fragment_two -> {
                viewModel.updateData("Name 2", "Example 2")
                replaceFragment(Singer2Fragment())
                true
            }
            R.id.menu_fragment_three -> {
                viewModel.updateData("Name 3", "Example 3")
                replaceFragment(Singer3Fragment())
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_view, fragment)
            .commit()
    }
}

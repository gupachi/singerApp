import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.singerapp.R
import com.example.singerapp.Singer1Fragment
import com.example.singerapp.Singer2Fragment
import com.example.singerapp.Singer3Fragment
import com.example.singerapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: SingerViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this

        setSupportActionBar(binding.toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.singer_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_fragment_one -> {
                viewModel.updateData(0)
                replaceFragment(Singer1Fragment())
                true
            }
            R.id.menu_fragment_two -> {
                viewModel.updateData(1)
                replaceFragment(Singer2Fragment()) // 다른 Fragment로 교체
                true
            }
            R.id.menu_fragment_three -> {
                viewModel.updateData(2)
                replaceFragment(Singer3Fragment()) // 다른 Fragment로 교체
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

}
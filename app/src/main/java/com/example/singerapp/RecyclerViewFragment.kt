import android.os.Bundle
import com.example.singerapp.SingerData
import com.example.singerapp.data.Singer

mport android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.singerapp.databinding.FragmentRecyclerViewBinding

class RecyclerViewFragment : Fragment() {
    private lateinit var binding: FragmentRecyclerViewBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // 데이터 바인딩 설정
        binding = FragmentRecyclerViewBinding.inflate(inflater, container, false)
        val view = binding.root

        // RecyclerView 설정
        setupRecyclerView()

        return view
    }

    private fun setupRecyclerView() {
        // RecyclerView의 LayoutManager 설정
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // RecyclerView Adapter 설정 (예시로 임시 데이터 사용)
        val adapter = SingerAdapter(getDummyData()) // getDummyData()는 임의의 데이터를 반환하는 메서드
        binding.recyclerView.adapter = adapter
    }

    // 임시 데이터 생성 예시 메서드
    private fun getDummyData(): List<Singer> {
        return listOf(

        )
    }
}
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.updateTransition
import androidx.compose.ui.res.painterResource
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.singerapp.R
import com.example.singerapp.SingerViewModel
import com.example.singerapp.databinding.FragmentSinger1Binding


class Singer1Fragment : Fragment() {
    private lateinit var binding: FragmentSinger1Binding
    private val viewModel: SingerViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // 데이터 바인딩 설정
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_singer2, container, false)
        binding.viewModel = viewModel


        // 버튼 클릭 이벤트 처리
        binding.button.setOnClickListener {
            loadRecyclerViewFragment() // RecyclerViewFragment를 로드하는 메서드 호출
        }

        return binding.root
    }

    private fun loadRecyclerViewFragment() {
        // RecyclerViewFragment를 생성
        val recyclerViewFragment = RecyclerViewFragment()

        val transaction = parentFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, recyclerViewFragment)
        transaction.addToBackStack(null) // 뒤로 가기 스택에 추가
        transaction.commit()
    }

}
package com.example.singerapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.singerapp.R
import com.example.singerapp.SingerViewModel
import com.example.singerapp.databinding.FragmentSinger2Binding

class Singer2Fragment : Fragment() {
    private lateinit var binding: FragmentSinger2Binding
    private val viewModel: SingerViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // 데이터 바인딩 설정
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_singer2, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        return binding.root
    }
}


package com.example.singerapp

import InventoryViewModel
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.singerapp.databinding.Singer1PageBinding
import com.example.singerapp.databinding.Singer3PageBinding


class Singer3Fragment: Fragment() {

    private val viewModel: InventoryViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // 바인딩 클래스 타입을 명시합니다.
        val binding: Singer3PageBinding = DataBindingUtil.inflate(
            inflater, R.layout.singer3_page, container, false
        )
        return binding.root
    }
}
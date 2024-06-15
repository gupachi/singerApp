
package com.example.singerapp


import SingerViewModel
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.singerapp.R
import com.example.singerapp.databinding.FragmentSinger1Binding


class Singer1Fragment: Fragment() {

    private val viewModel: SingerViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSinger1Binding = DataBindingUtil.inflate(
            inflater, R.layout.singer1_page, container, false
        )
        return binding.root
    }

}


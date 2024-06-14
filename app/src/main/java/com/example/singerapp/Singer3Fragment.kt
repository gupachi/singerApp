
package com.example.singerapp

import SingerViewModel
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels


class Singer3Fragment : Fragment() {

    private val singerviewModel: SingerViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // DataBindingUtil을 사용하여 레이아웃을 인플레이트하고 ViewModel을 바인딩합니다.
        val binding = DataBindingUtil.inflate(
            inflater, R.layout.singer3_page, container, false)
        return binding.root
    }
}
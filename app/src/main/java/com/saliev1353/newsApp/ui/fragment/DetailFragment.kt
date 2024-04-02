package com.saliev1353.newsApp.ui.fragment

import androidx.fragment.app.Fragment
import com.saliev1353.newsApp.core.BaseFragment
import com.saliev1353.newsApp.databinding.FragmentDetailBinding

class DetailFragment : BaseFragment<FragmentDetailBinding>() {
    override fun getViewBinding(): FragmentDetailBinding = FragmentDetailBinding.inflate(layoutInflater)

}
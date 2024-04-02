package com.saliev1353.newsApp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.saliev1353.newsApp.R
import com.saliev1353.newsApp.core.BaseFragment
import com.saliev1353.newsApp.databinding.FragmentFavoriteBinding

class FavoriteFragment : BaseFragment<FragmentFavoriteBinding>() {
    override fun getViewBinding(): FragmentFavoriteBinding = FragmentFavoriteBinding.inflate(layoutInflater)
}
package com.saliev1353.newsApp.ui.fragment

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.saliev1353.newsApp.R
import com.saliev1353.newsApp.core.BaseFragment
import com.saliev1353.newsApp.databinding.FragmentHomeBinding
import com.saliev1353.newsApp.ui.adapter.HomeAdapter
import com.saliev1353.newsApp.ui.viewModel.MainViewModel

class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    private var postName = "Bisness"
    private val adapter : HomeAdapter by lazy { HomeAdapter() }


    private val viewModel: MainViewModel by viewModels()

    override fun getViewBinding(): FragmentHomeBinding = FragmentHomeBinding.inflate(layoutInflater)

    override fun constructListeners() {
       binding.notification.setOnClickListener {
               findNavController().navigate(R.id.notificationFragment)
       }

        viewModel.getNews("Tesla", "business")
        binding.rvNews.adapter = adapter
        viewModel.livedata.observe(this){
            adapter.submitList(it.articles)
        }
    }
}
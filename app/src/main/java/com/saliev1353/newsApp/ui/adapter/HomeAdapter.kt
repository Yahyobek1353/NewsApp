package com.saliev1353.newsApp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.saliev1353.newsApp.data.model.ArticlesDto
import com.saliev1353.newsApp.databinding.ItemNewsBinding

class HomeAdapter : ListAdapter<ArticlesDto, HomeAdapter.HomeViewHolder>(HomeDiffUtill()) {
    class HomeViewHolder (private val binding: ItemNewsBinding) : ViewHolder(binding.root) {
        fun onBind(it : ArticlesDto?){
            binding.postAuthor.text = it?.author
            binding.postData.text = it?.publishedAt
            binding.postName.text = it?.title
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        return HomeViewHolder(ItemNewsBinding.inflate(LayoutInflater.from(parent.context) , parent , false))
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val homeModel = getItem(position)
        holder.onBind(homeModel)
    }

    class HomeDiffUtill : DiffUtil.ItemCallback<ArticlesDto>(){

        override fun areItemsTheSame(oldItem: ArticlesDto, newItem: ArticlesDto): Boolean {
          return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: ArticlesDto, newItem: ArticlesDto): Boolean {
            return oldItem == newItem
        }
    }
}



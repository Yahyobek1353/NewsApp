package com.saliev1353.newsApp.ui.viewModel


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saliev1353.newsApp.data.model.EverythingDto
import com.saliev1353.newsApp.data.remote.repository.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repo: NewsRepository
): ViewModel() {

    var livedata = MutableLiveData<EverythingDto>()

    fun getNews(name: String, category: String) {
        livedata = repo.getNews(name, category)
    }


}

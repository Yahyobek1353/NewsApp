package com.saliev1353.newsApp.data.remote.repository

import android.util.Log
import androidx.lifecycle.MediatorLiveData
import com.saliev1353.newsApp.data.model.EverythingDto
import com.saliev1353.newsApp.data.remote.apiService.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class NewsRepository @Inject constructor(private val apiService: ApiService) {

    fun getNews(newsName: String , category: String):MediatorLiveData<EverythingDto>{
        val liveData = MediatorLiveData<EverythingDto>()
        apiService.getNews(newsName = newsName , category = category).enqueue(object : Callback<EverythingDto>{
            override fun onResponse(call: Call<EverythingDto>, response: Response<EverythingDto>) {
                if (response.isSuccessful){
                    liveData.value = response.body()
                }
            }

            override fun onFailure(call: Call<EverythingDto>, t: Throwable) {
                t.message?.let { Log.e("ololo" , it) }
            }

        })
        return liveData
    }

}
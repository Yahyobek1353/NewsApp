package com.saliev1353.newsApp.data.remote.apiService

import com.saliev1353.newsApp.BuildConfig.API_KEY
import com.saliev1353.newsApp.data.model.EverythingDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET()
    fun getNews(
        @Query("q") newsName : String? = null,
        @Query("ApiKey") key : String = API_KEY,
        @Query("category") category : String? = null,

    ): Call<EverythingDto>

    @GET()
    fun getTopNews(
        @Query("country") country : String = "us",
    ): Call<EverythingDto>


}
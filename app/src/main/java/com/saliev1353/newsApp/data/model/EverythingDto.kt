package com.saliev1353.newsApp.data.model

data class EverythingDto(
    val status : String,
    val totalResults : Int,
    val articles : List<ArticlesDto>
)

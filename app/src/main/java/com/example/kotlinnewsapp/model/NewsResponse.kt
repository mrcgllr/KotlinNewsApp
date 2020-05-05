package com.example.kotlinnewsapp.model

import com.example.kotlinnewsapp.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)
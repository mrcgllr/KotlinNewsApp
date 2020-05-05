package com.example.kotlinnewsapp

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)
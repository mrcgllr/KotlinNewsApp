package com.example.kotlinnewsapp.repository

import com.example.kotlinnewsapp.api.RetrofitService
import com.example.kotlinnewsapp.database.ArticleDatabase

class NewsRepository(val db: ArticleDatabase) {

    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitService.api.getBreakingNews(countryCode, pageNumber)


}
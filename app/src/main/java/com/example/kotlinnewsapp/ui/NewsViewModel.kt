package com.example.kotlinnewsapp.ui

import androidx.lifecycle.ViewModel
import com.example.kotlinnewsapp.repository.NewsRepository

class NewsViewModel(val newsRepository: NewsRepository) :ViewModel(){
}
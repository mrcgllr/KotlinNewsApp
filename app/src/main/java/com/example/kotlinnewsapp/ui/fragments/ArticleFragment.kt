package com.example.kotlinnewsapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.kotlinnewsapp.R
import com.example.kotlinnewsapp.ui.NewsActivity
import com.example.kotlinnewsapp.ui.NewsViewModel

/**
 * A simple [Fragment] subclass.
 */
class ArticleFragment : Fragment(R.layout.fragment_article) {
    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = (activity as NewsActivity).viewModel
    }

}

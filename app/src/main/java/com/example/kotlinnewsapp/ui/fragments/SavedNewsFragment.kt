package com.example.kotlinnewsapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment


import com.example.kotlinnewsapp.R
import com.example.kotlinnewsapp.ui.NewsActivity
import com.example.kotlinnewsapp.ui.NewsViewModel

/**
 * A simple [Fragment] subclass.
 */
class SavedNewsFragment : Fragment(R.layout.fragment_saved_news) {
    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = (activity as NewsActivity).viewModel
    }

}

package com.example.newsapi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.newsapi.databinding.NewsDetailsBinding
import com.example.newsapi.model.NewsDetails

class NewsDetailsActivity : AppCompatActivity() {
    private lateinit var binding : NewsDetailsBinding

    override  fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = DataBindingUtil.setContentView(this, R.layout.news_details)

        val news: NewsDetails? = intent.extras!!.getParcelable("news")
        binding.newsDetail = news

    }
}
package com.example.newsapi.repository

import com.example.newsapi.api.Api
import com.example.newsapi.model.NewsModel
import io.reactivex.Observable


class NewsRepository(private val api: Api) : NewsInterface {
    override fun getNews(): Observable<NewsModel> {
        return api.getNews()
    }
}

interface NewsInterface {
    fun getNews(): Observable<NewsModel>
}



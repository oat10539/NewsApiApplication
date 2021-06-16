package com.example.newsapi.model


data class NewsModel (
    var status: String? = null,
    var articles: List<NewsDetails>? = null
)

data class NewsDetails (
    var author: String? = null,
    var title: String? = null,
    var description: String? = null,
    var url: String? = null,
    var urlToImage: String? = null,
    var publishedAt: String? = null,
    var content: String? = null
)
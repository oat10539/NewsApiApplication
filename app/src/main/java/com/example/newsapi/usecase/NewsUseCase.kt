package com.example.newsapi.usecase

import com.example.newsapi.model.NewsDetails
import com.example.newsapi.repository.NewsRepository
import io.reactivex.Observable

interface NewsUseCaseInterface {
    fun execute(): Observable<List<NewsDetails>>
}

class NewsUseCase(private val repository: NewsRepository) :
    NewsUseCaseInterface {
    override fun execute(): Observable<List<NewsDetails>> {
        return repository.getNews()
            .map { it.articles }
    }
}
package com.example.newsapi.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.newsapi.model.NewsDetails
import com.example.newsapi.usecase.NewsUseCase
import io.reactivex.schedulers.Schedulers
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo


class ViewModel(private val useCase: NewsUseCase) : ViewModel() {


    private var newsList = MutableLiveData<List<NewsDetails>>()
    private var errorMessage = MutableLiveData<String>()
    private val compositeDisposable = CompositeDisposable()


    fun newsList(): LiveData<List<NewsDetails>> = newsList
    fun errorMessage(): LiveData<String> = errorMessage


    fun getNews() {
        useCase.execute()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ articles ->
                newsList.value = articles
            }, { error ->
                errorMessage.value = error.message
            })
            .addTo(compositeDisposable)
    }
}
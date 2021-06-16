package com.example.newsapi.module

import com.example.newsapi.api.OkHttpBuilder
import com.example.newsapi.api.RetrofitBuilder
import com.example.newsapi.repository.NewsRepository
import com.example.newsapi.usecase.NewsUseCase
import com.example.newsapi.viewmodel.ViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

@JvmField
val appModule = module {

    factory { NewsRepository(get()) }

    factory{ NewsUseCase(get()) }

    viewModel { ViewModel(get()) }

    single { OkHttpBuilder().build() }

    single { RetrofitBuilder(get()).build(get())}
}
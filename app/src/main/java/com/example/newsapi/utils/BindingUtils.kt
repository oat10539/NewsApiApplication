package com.example.newsapi.utils

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide


@BindingAdapter("newsImage")
fun ImageView.setNewsImage(url: String?) {
        Glide.with(this)
            .load(url)
            .into(this)
}

@BindingAdapter("date")
fun TextView.setDate(date: String?) {
    date.let {
        text = dateFormat(it)
    }
}

@BindingAdapter("author")
fun TextView.setAuthor(author: String?) {
    author.let {
        text = "By : ${authorFormat(it)}"
    }
}


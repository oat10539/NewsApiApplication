package com.example.newsapi.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide



@BindingAdapter("newsImage")
fun ImageView.setNewsImage(url: String?) {
        Glide.with(this)
            .load(url)
            .into(this)
}
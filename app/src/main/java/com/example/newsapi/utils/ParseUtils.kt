package com.example.newsapi.utils

import java.text.SimpleDateFormat
import java.util.*


fun dateFormat(stringDate: String?): String? {
    val dateFormat = SimpleDateFormat("E, d MMM yyyy", Locale.ENGLISH)
    val date: Date = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse(stringDate)
    return dateFormat.format(date)
}

fun authorFormat(author: String?):String?{
    return  author?.substringAfterLast("/")
}

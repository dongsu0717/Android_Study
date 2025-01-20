package com.dongsu.androidstudy.core.model

data class News(
    val title: String,
    val link: String,
    val description: String,
    val total: Int,
    val start: Int,
    val display: Int,
    val items: List<NewsItem>
)

data class NewsItem(
    val title: String,
    val originallink: String,
    val link: String,
    val description: String,
    val pubDate: String
)

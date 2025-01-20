package com.dongsu.androidstudy.feature.main

import com.dongsu.androidstudy.feature.home.R

enum class MainScreenTab(
    val index: Int,
    val title: Int,
) {
    ALL_NEWS(0, R.string.all_news),
    FAVORITE_NEWS(1, R.string.my_favorite_news)
}
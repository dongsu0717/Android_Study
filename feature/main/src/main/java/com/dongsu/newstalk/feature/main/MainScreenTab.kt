package com.dongsu.newstalk.feature.main

import androidx.compose.ui.res.stringResource
import com.dongsu.newstalk.feature.home.R

enum class MainScreenTab(
    val index: Int,
    val title: Int,
) {
    ALL_NEWS(0, R.string.all_news),
    FAVORITE_NEWS(1, R.string.my_favorite_news)
}
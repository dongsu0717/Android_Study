package com.dongsu.androidstudy.core.network.datasource

import com.dongsu.androidstudy.core.model.News

interface NewsDataSource {
    suspend fun fetchNews(
        query: String,
        display: Int,
        start: Int,
        sort: String,
    ): News
}
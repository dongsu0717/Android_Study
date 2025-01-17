package com.dongsu.newstalk.core.network.datasource

import com.dongsu.newstalk.core.model.News

interface NewsDataSource {
    suspend fun fetchNews(
        query: String,
        display: Int,
        start: Int,
        sort: String,
    ): News
}
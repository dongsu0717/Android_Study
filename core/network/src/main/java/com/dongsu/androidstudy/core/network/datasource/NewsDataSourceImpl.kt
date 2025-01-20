package com.dongsu.androidstudy.core.network.datasource

import com.dongsu.androidstudy.core.model.News
import com.dongsu.androidstudy.core.network.api.NewsService
import javax.inject.Inject

class NewsDataSourceImpl @Inject constructor(
    private val newsService: NewsService
): NewsDataSource {
    override suspend fun fetchNews(query: String, display: Int, start: Int, sort: String): News {
        TODO("Not yet implemented")
    }
}
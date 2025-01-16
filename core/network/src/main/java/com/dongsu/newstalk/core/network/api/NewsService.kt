package com.dongsu.newstalk.core.network.api

import com.dongsu.newstalk.core.network.model.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

const val NEWS_URL = "https://openapi.naver.com/"
const val NEWS_INFO = "v1/search/news.json"

/**
 * News service
 * @param query 검색어
 * @param display 한번에 표기할 검색 결과 갯수 (기본값: 10, 최댓값: 100)
 * @param start 검색 시작 위치 (기본값: 1, 최댓값: 1000)
 * @param sort sim(정확도순으로 내림차순 정렬 - Default), date(날짜순으로 내림차순 정렬)
 * @constructor Create empty News service
 */


interface NewsService {

    @GET(NEWS_INFO)
    suspend fun fetchNewsService(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int,
        @Query("sort") sort: String,
    ): Response<Unit>
}
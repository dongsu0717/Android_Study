package com.dongsu.androidstudy.core.network.model

import com.google.gson.annotations.SerializedName

/**
 * News response
 *
 * @property title
 * @property link
 * @property description
 * @property total 총 검색 결과 갯수
 * @property start 검색 시작 위치
 * @property display 한번에 표시할 검색 결과 갯수
 * @property item
 */

data class NewsResponse(
    @SerializedName("title")
    val title: String,

    @SerializedName("link")
    val link: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("total")
    val total: Int,

    @SerializedName("start")
    val start: Int,

    @SerializedName("display")
    val display: Int,

    @SerializedName("items")
    val item: List<NewsItem>,
)

/** News item
 *
 * @property title 기사 제목 (제목이랑 일치하는 부분은 <b>태그로 감싸져있음)
 * @property originallink 뉴스기사 원문 URL
 * @property link 뉴스 기사의 네이버 뉴스 URL
 * @property description 뉴스 기사의 내용을 요약한 패시지 정보 (검색이랑 일치하면 <b> 태그로감싸져 있음
 * @property putDate 뉴스 기사가 네이버에 제공된 시간
 */

data class NewsItem(
    @SerializedName("title")
    val title: String,

    @SerializedName("originallink")
    val originallink: String,

    @SerializedName("link")
    val link: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("pubDate")
    val putDate: String
)

/** Error Code
 * 오류코드
 * @sample SE01
 * @sample SE02
 * @sample SE03
 * @sample SE04
 * @sample SE05
 * @sample SE06
 * @sample SE99
 */


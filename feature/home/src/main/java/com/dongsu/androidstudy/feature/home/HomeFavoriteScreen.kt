package com.dongsu.androidstudy.feature.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import com.dongsu.androidstudy.core.designsystem.component.NewsTalkButton


@Composable
fun HomeFavoriteScreen(

) {
    val favoriteNews: List<String> by remember { mutableStateOf(emptyList()) }
    val news by remember { mutableStateOf(null) }
    FavoriteNewsCategory(favoriteNews)
    FavoriteNewsContent()
}

@Composable
fun FavoriteNewsCategory(
    favoriteNews: List<String>
) {
    LazyRow (
        verticalAlignment = CenterVertically,
    ) {
        items(favoriteNews.size) { favoriteNew ->
            NewsTalkButton(
                onClick = {},
                title = favoriteNews[favoriteNew]
            )
        }
    }
}

@Composable
fun FavoriteNewsContent(

) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "보기가 화면은 아직 준비 중입니다.")
    }
}

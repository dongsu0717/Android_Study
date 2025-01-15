package com.dongsu.newstalk.feature.home

import androidx.annotation.DrawableRes
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp


@Composable
fun HomeScreen(

) {
    HotFixHorizontalPager()
    Spacer(modifier = Modifier.height(16.dp))
    NewsCategroy()
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HotFixHorizontalPager(

) {
    val pagerState = rememberPagerState(pageCount = {10})

    HorizontalPager(
        state = pagerState,
    ) {
        Text(
            text = "광고 Page $it",
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.Gray),
        )
    }
}

@Composable
fun NewsCategroy(

) {
    val categories = listOf(
        "정치" to com.dongsu.newstalk.core.designsystem.R.drawable.search_24,
        "경제" to com.dongsu.newstalk.core.designsystem.R.drawable.search_24,
        "사회" to com.dongsu.newstalk.core.designsystem.R.drawable.search_24,
        "문화" to com.dongsu.newstalk.core.designsystem.R.drawable.search_24,
        "과학" to com.dongsu.newstalk.core.designsystem.R.drawable.search_24,
        "스포츠" to com.dongsu.newstalk.core.designsystem.R.drawable.search_24,
        "기술" to com.dongsu.newstalk.core.designsystem.R.drawable.search_24,
        "정치" to com.dongsu.newstalk.core.designsystem.R.drawable.search_24,
        "경제" to com.dongsu.newstalk.core.designsystem.R.drawable.search_24,
        "사회" to com.dongsu.newstalk.core.designsystem.R.drawable.search_24,
        "문화" to com.dongsu.newstalk.core.designsystem.R.drawable.search_24,
        "과학" to com.dongsu.newstalk.core.designsystem.R.drawable.search_24
    )

    LazyVerticalGrid (
        columns = GridCells.Fixed(5),
        modifier = Modifier.fillMaxWidth()
    ) {
        items(categories) { category ->
            NewsCategoryItem(
                name = category.first,
                imageRes = category.second
            )
        }
    }
}

@Composable
fun NewsCategoryItem(
    name: String,
    @DrawableRes imageRes: Int
) {
    Column(
        modifier = Modifier
            .width(80.dp)
            .clickable {  },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
                .background(Color.LightGray)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = name,
            textAlign = TextAlign.Center
        )
    }
}

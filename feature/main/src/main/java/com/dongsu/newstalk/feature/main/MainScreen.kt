package com.dongsu.newstalk.feature.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.dongsu.newstalk.core.designsystem.component.NewsTalkTabRow
import com.dongsu.newstalk.core.designsystem.component.NewsTalkTopAppBar
import com.dongsu.newstalk.feature.home.HomeFavoriteScreen
import com.dongsu.newstalk.feature.home.HomeScreen


@Composable
fun MainScreen(

) {
    var selectedTabIndex by remember { mutableIntStateOf(MainScreenTab.ALL_NEWS.index) }
    Scaffold(
        topBar = {
            NewsTalkTopAppBar(
                title = "NewsTalk",
                showBackButton = true,
                searchButton = true,
            )
        }
    ) {paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {

            val tabTitles = MainScreenTab.entries.map { stringResource(id = it.title) }
            NewsTalkTabRow(
                tabTitles = tabTitles,
                selectedTabIndex = selectedTabIndex,
                onTabSelected = { selectedTabIndex = it }
            )
            when (selectedTabIndex) {
                MainScreenTab.ALL_NEWS.index -> {
                    HomeScreen()
                }
                MainScreenTab.FAVORITE_NEWS.index -> {
                    HomeFavoriteScreen()
                }
            }
        }
    }
}
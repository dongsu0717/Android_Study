package com.dongsu.androidstudy.core.designsystem.component

import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun NewsTalkTabRow(
    tabTitles: List<String>,
    selectedTabIndex: Int,
    onTabSelected: (Int) -> Unit,
) {
    TabRow(
        selectedTabIndex = selectedTabIndex,
    ) {
        tabTitles.forEachIndexed { index, title ->
            Tab(
                selected = selectedTabIndex == index,
                onClick = { onTabSelected(index) },
                text = { Text(title) }
            )
        }
    }
}

@Preview
@Composable
fun NewsTalkTabRowPreview() {
    val tabTitles = listOf("Tab 1", "Tab 2", "Tab 3")
    var selectedTabIndex = 0
    NewsTalkTabRow(tabTitles, selectedTabIndex) {
        selectedTabIndex = it
    }
}
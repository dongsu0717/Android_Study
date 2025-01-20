package com.dongsu.androidstudy.core.designsystem.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.dongsu.androidstudy.core.designsystem.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewsTalkTopAppBar(
    title: String,
    showBackButton: Boolean = false,
    searchButton: Boolean = false,
    alarmButton: Boolean = false,
) {
    TopAppBar(
        title = {
            Text(
               text = title,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        },
        navigationIcon = {
            if (showBackButton) {
                IconButton(
                    onClick = { }
                ) {
                    Icon(
                        painter = painterResource(R.drawable.back_button_24),
                        contentDescription = "Back",
                    )
                }
            }
        },
        actions = {
            if (searchButton) {
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        painter = painterResource(R.drawable.search_24),
                        contentDescription = "Search"
                    )
                }
            }
            if (alarmButton) {
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        painter = painterResource(R.drawable.notifications_active_24),
                        contentDescription = "Alarm"
                    )
                }
            }
        },
    )
}

@Preview
@Composable
private fun NewsTalkTopAppBarPreview() {
    NewsTalkTopAppBar(
        title = "NewsTalk",
        showBackButton = true,
        searchButton = true,
        alarmButton = true,
    )
}

@Preview
@Composable
private fun NewsTalkTopAppBarPreview2() {
    NewsTalkTopAppBar(
        title = "NewsTalk",
        showBackButton = true,
        searchButton = true,
        alarmButton = false,
    )
}
package com.dongsu.androidstudy.core.designsystem.component

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun NewsTalkButton(
    onClick: () -> Unit,
    title: String,
) {
    Button(
        onClick = {  }
    ) {
        Text(text = title)
    }
}
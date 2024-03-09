package com.topic2.android.notes.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp

@Composable
fun NoteColor(){
    Box(
        modifier = Modifier
            .padding(4.dp)
            .size(40.dp)
            .background(Color.Red)
            .clip(CircleShape)
            .border(
                BorderStroke(
                    2.dp,
                    SolidColor(Color.Black)
                ),
                CircleShape
            )
    )
}
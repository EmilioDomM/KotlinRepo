package com.example.tipapp_starter.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.CombinedClickableNode
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun RoundedIconButton(
    modifier: Modifier = Modifier,
    imageVector: ImageVector,
    onClick: () -> Unit,
    color: Color = Color.Black,
    backgroundColor: Color = MaterialTheme.colorScheme.background,
    borderColor: Color = Color.Transparent

){
    Card(
        modifier = modifier
            .padding(4.dp)
            .size(40.dp)
            .clickable { },
        shape = CircleShape,
        colors = CardDefaults.cardColors(containerColor = backgroundColor),
        border = if (borderColor != Color.Transparent) BorderStroke(
            width = 1.dp,
            color = borderColor
        ) else null
    ) {
        Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
            Icon(imageVector = imageVector, contentDescription = "", tint = Color.Black)
        }
    }
}
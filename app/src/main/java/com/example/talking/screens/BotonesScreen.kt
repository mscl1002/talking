package com.adso.myappsplash.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.random.Random

@Composable
fun BotonesScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopStart
    ) {
        IconButtonExample()
    }
}

@Composable
fun IconButtonExample() {
    var color = Color.Black
    IconButton(
        onClick = {

        },
        modifier = Modifier.size(80.dp).height(20.dp)
    ) {
        Icon(
            Icons.Filled.Home,
            contentDescription = "Botón color negro",
            tint = color,
            modifier = Modifier.size(60.dp)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun BotonesScreenPreview() {
    BotonesScreen()
}

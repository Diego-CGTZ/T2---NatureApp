package com.example.natureapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.natureapp.ui.PlaceCard
import com.example.natureapp.models.Place
import com.example.natureapp.models.places

@Composable
fun NatureApp() {
    val scrollState = rememberScrollState()
    Column(modifier = Modifier.verticalScroll(scrollState)) {
        places.forEach { place ->
            PlaceCard(place)
        }
    }
}
package dev.pinkroom.mvvmtemplate.ui.homescreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController

@Composable
fun Homescreen(
    navController: NavHostController,
    viewModel: HomeScreenViewModel = hiltViewModel(),
) {
    val state by viewModel.state.collectAsState()
    HomescreenContent(state, viewModel)
}

@Composable
private fun HomescreenContent(
    state: HomescreenState,
    viewModel: HomeScreenViewModel,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = state.text,)
    }
}
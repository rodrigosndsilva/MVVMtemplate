package dev.pinkroom.mvvmtemplate.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import dev.pinkroom.mvvmtemplate.ui.navigation.Screen
import dev.pinkroom.mvvmtemplate.ui.navigation.SetupNavGraph
import dev.pinkroom.mvvmtemplate.ui.theme.Background
import dev.pinkroom.mvvmtemplate.ui.theme.MVVMTemplateTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            MVVMTemplateTheme {
                MainActivityContent()
            }
        }
    }
}

@Composable
fun MainActivityContent(
) {
    val navController = rememberNavController()
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .navigationBarsPadding(),
        color = Background,
        ) {
        SetupNavGraph(
            navController = navController,
            startDestination = Screen.Homescreen.route,
        )
    }
}
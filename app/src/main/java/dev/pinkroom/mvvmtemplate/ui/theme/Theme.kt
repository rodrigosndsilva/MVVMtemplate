package dev.pinkroom.mvvmtemplate.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val DarkColorPalette = darkColors(
    primary = Green,
    primaryVariant = Pink,
    secondary = DarkGrey,
    background = Background,
    surface = Grey,
    onSurface = DarkGrey,
)

private val LightColorPalette = lightColors(
    primary = Green,
    primaryVariant = Pink,
    secondary = DarkGrey,
    background = Background,
)

@Composable
fun MVVMTemplateTheme(content: @Composable () -> Unit) {
    val colors = LightColorPalette
    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content,
    )
    SystemUiTheme()
}

@Composable
private fun SystemUiTheme() {
    val systemUiController = rememberSystemUiController()
    systemUiController.setSystemBarsColor(
        color = Background,
        darkIcons = true,
    )
    systemUiController.setNavigationBarColor(
        color = Background,
        darkIcons = true,
    )
}
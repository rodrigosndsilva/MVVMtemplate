package dev.pinkroom.mvvmtemplate.ui.theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import dev.pinkroom.mvvmtemplate.R

val matrice = FontFamily(
    Font(R.font.matrice_extrabold, FontWeight.ExtraBold),
    Font(R.font.matrice_black, FontWeight.Black),
    Font(R.font.matrice_bold, FontWeight.Bold),
    Font(R.font.matrice_regular, FontWeight.Normal),
    Font(R.font.matrice_light, FontWeight.Light),
)

val Typography: Typography
    @Composable
    get() = Typography(
        h1 = TextStyle(
            fontFamily = matrice,
            fontWeight = FontWeight.ExtraBold,
            fontSize = dimens.extraLargeText,
            color = DarkGrey,
        ),
        h2 = TextStyle(
            fontFamily = matrice,
            fontWeight = FontWeight.Black,
            fontSize = dimens.largeText,
            color = DarkGrey,
        ),
        h3 = TextStyle(
            fontFamily = matrice,
            fontWeight = FontWeight.Bold,
            fontSize = dimens.normalText,
            color = DarkGrey,
        ),
        h4 = TextStyle(
            fontFamily = matrice,
            fontWeight = FontWeight.Bold,
            fontSize = dimens.normalText,
            color = Pink,
        ),
        body1 = TextStyle(
            fontFamily = matrice,
            fontWeight = FontWeight.Normal,
            fontSize = dimens.normalText,
            color = DarkGrey
        ),
        body2 = TextStyle(
            fontFamily = matrice,
            fontWeight = FontWeight.Normal,
            fontSize = dimens.smallText,
            color = DarkGrey,
        ),
        button = TextStyle(
            fontFamily = matrice,
            fontWeight = FontWeight.Bold,
            fontSize = dimens.normalText,
            color = DarkGrey,
        ),
        caption = TextStyle(
            fontFamily = matrice,
            fontWeight = FontWeight.Normal,
            fontSize = dimens.smallText,
            color = Red,
        ),
    )
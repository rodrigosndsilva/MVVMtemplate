package dev.pinkroom.mvvmtemplate.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Dimensions(
    // Padding
    val extraSmallPadding: Dp = 4.dp,
    val smallPadding: Dp = 6.dp,
    val normalPadding: Dp = 14.dp,
    val largePadding: Dp = 24.dp,
    val largerPadding: Dp = 34.dp,
    val extraLargePadding: Dp = 40.dp,
    val hugePadding: Dp = 90.dp,
    // Size
    val smallSize: Dp = 8.dp,
    val mediumSize: Dp = 16.dp,
    val extraLargeSize: Dp = 200.dp,
    // Thickness
    val smallThickness: Dp = 1.dp,
    // Elevation
    val elevation: Dp = 2.dp,
    // Button
    val buttonSize: Dp = 50.dp,
    // Icon
    val smallIcon: Dp = 25.dp,
    // Text
    val extraSmallText: TextUnit = 12.sp,
    val smallText: TextUnit = 14.sp,
    val normalText: TextUnit = 16.sp,
    val largeText: TextUnit = 26.sp,
    val extraLargeText: TextUnit = 32.sp,
)

val dimens: Dimensions
    @Composable
    get() {
        val configuration = LocalConfiguration.current
        return when {
            configuration.screenHeightDp <= 600 -> smallDimensions
            configuration.screenHeightDp <= 800 -> normalDimensions
            else -> sw360Dimensions
        }
    }

private val smallDimensions = Dimensions(
    // Padding
    extraSmallPadding = 2.dp,
    smallPadding = 3.dp,
    normalPadding = 12.dp,
    largePadding = 14.dp,
    extraLargePadding = 25.dp,
    hugePadding = 50.dp,
    // Size
    mediumSize = 14.dp,
    // Elevation
    elevation = 2.dp,
    // Button
    buttonSize = 46.dp,
    // Text
    extraSmallText = 8.sp,
    smallText = 10.sp,
    normalText = 12.sp,
    largeText = 16.sp,
    extraLargeText = 22.sp,
)
private val normalDimensions = Dimensions(
    extraSmallText = 6.sp,
    smallText = 8.sp,
    normalText = 12.sp,
    largeText = 16.sp,
    extraLargeText = 24.sp,
)
private val sw360Dimensions = Dimensions()
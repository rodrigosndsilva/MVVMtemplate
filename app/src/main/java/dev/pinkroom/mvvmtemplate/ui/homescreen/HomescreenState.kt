package dev.pinkroom.mvvmtemplate.ui.homescreen

import dev.pinkroom.peanuts.PeanutState

@PeanutState
data class HomescreenState(
    val text: String = "Hello world!",
)
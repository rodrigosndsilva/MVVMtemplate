package dev.pinkroom.mvvmtemplate.ui.homescreen

sealed class HomescreenEffect {
    object NavigateBack : HomescreenEffect()
}
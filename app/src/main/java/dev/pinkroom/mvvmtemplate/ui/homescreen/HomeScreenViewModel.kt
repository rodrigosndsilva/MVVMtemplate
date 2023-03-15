package dev.pinkroom.mvvmtemplate.ui.homescreen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel
@Inject constructor() : ViewModel() {
    private val _state = MutableStateFlow(HomescreenState())
    private val _effect = MutableSharedFlow<HomescreenEffect>()
    val effect = _effect.asSharedFlow()
    val state = _state.asStateFlow()
}
package com.example.hilt_app.viewmodel

import com.example.hilt_app.di.scopes.ActivityScope
import com.example.hilt_app.repositoriy.UserRepository
import javax.inject.Inject

@ActivityScope
class MainViewModel @Inject constructor(
        private val userRepository: UserRepository
) {
    val item="Emad"
}
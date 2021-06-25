package com.example.hilt_app.datasource

import com.example.hilt_app.network.MainActivityApi
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val mainActivityApi: MainActivityApi
) {
}
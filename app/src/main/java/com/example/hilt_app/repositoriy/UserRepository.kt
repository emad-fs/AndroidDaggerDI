package com.example.hilt_app.repositoriy

import com.example.hilt_app.datasource.LocalDataSource
import com.example.hilt_app.datasource.RemoteDataSource
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(
        private val localDataSource: LocalDataSource,
        private val remoteDataSource: RemoteDataSource
) {
}
package com.example.hilt_app.network

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class NetworkModule {
    @Singleton
    @Provides
    fun provideMainActivityApi(): MainActivityApi {
        return Retrofit.Builder()
            .baseUrl("https://example.com")
            .build()
            .create(MainActivityApi::class.java)
    }
}
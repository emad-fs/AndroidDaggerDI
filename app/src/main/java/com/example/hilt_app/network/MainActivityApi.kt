package com.example.hilt_app.network

import retrofit2.Call
import retrofit2.http.GET

interface MainActivityApi {

    @GET("users")
    fun getUsers() : Call<List<String>>
}
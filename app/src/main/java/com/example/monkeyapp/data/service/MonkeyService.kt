package com.example.monkeyapp.data.service

import com.example.monkeyapp.data.model.DataResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MonkeyService {

    @GET("users")
    suspend fun getUsersList(
        @Query("page") page: Int
    ): Response<DataResponse>
}
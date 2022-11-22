package com.example.monkeyapp.data.repository

import com.example.monkeyapp.data.commons.Output
import com.example.monkeyapp.data.model.DataResponse

interface MonkeyRepository {

    suspend fun getUserList(page: Int): Output<DataResponse>
}
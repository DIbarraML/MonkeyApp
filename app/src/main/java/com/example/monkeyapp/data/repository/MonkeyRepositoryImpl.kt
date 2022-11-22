package com.example.monkeyapp.data.repository

import com.example.monkeyapp.data.commons.Output
import com.example.monkeyapp.data.model.DataResponse
import com.example.monkeyapp.data.remote.MonkeyRemoteDataSource

class MonkeyRepositoryImpl(
    private val dataSource: MonkeyRemoteDataSource
): MonkeyRepository {
    override suspend fun getUserList(page: Int): Output<DataResponse> =
        dataSource.getUserList(page)
}
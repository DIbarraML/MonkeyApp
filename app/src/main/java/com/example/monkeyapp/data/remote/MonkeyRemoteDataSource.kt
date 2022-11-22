package com.example.monkeyapp.data.remote

import android.content.Context
import com.example.monkeyapp.data.ServiceFactory
import com.example.monkeyapp.data.commons.Output
import com.example.monkeyapp.data.model.DataResponse
import com.example.monkeyapp.data.service.MonkeyService
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MonkeyRemoteDataSource(
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO,
    context: Context
) {

    private val service: MonkeyService =
        ServiceFactory.createRepositoryApi(MonkeyService::class.java, context = context)

    suspend fun getUserList(page: Int): Output<DataResponse> {
        runCatching {
            withContext(dispatcher) {
                val result = service.getUsersList(page)
                result.body()
            }
        }.fold(
            onSuccess = { response ->
                return if (response != null) {
                    Output.Success(response)
                } else {
                    Output.Failure(Exception(MESSAGE_DEFAULT))
                }
            },
            onFailure = {
                return Output.Failure(it as Exception)
            }
        )
    }

    companion object {
        private const val MESSAGE_DEFAULT = "No response from server"
    }
}
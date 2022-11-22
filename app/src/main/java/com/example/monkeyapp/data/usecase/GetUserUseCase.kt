package com.example.monkeyapp.data.usecase

import com.example.monkeyapp.data.commons.Output
import com.example.monkeyapp.data.model.DataResponse
import com.example.monkeyapp.data.repository.MonkeyRepository

class GetUserUseCase(private val repository: MonkeyRepository) {

    suspend operator fun invoke(page: Int): Output<DataResponse> =
        repository.getUserList(page)
}
package com.example.monkeyapp.presentation

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.monkeyapp.data.commons.Output
import com.example.monkeyapp.data.model.User
import com.example.monkeyapp.data.usecase.GetUserUseCase
import kotlinx.coroutines.launch

class MonkeyViewModel(private val getUserUseCase: GetUserUseCase) : ViewModel() {

    val userListAct = mutableStateListOf<User>()


    fun getUsers(page: Int) {
        viewModelScope.launch {
            when (val output = getUserUseCase.invoke(page)) {
                is Output.Success -> {
                    userListAct.addAll(output.value.data)
                }
                is Output.Failure -> {
                }
            }
        }

    }
}
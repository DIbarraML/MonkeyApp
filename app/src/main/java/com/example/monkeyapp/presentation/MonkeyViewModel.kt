package com.example.monkeyapp.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.monkeyapp.data.commons.Output
import com.example.monkeyapp.data.model.DataResponse
import com.example.monkeyapp.data.usecase.GetUserUseCase
import kotlinx.coroutines.launch

class MonkeyViewModel(private val getUserUseCase: GetUserUseCase): ViewModel() {

    private val _userList: MutableLiveData<DataResponse> = MutableLiveData()
    val userList: LiveData<DataResponse> = _userList


    fun getUsers(page: Int) {
        viewModelScope.launch {
            when (val output = getUserUseCase.invoke(page)) {
                is Output.Success -> {
                    _userList.value = output.value
                    println("SUCCES -> ${output.value.data}")
                }
                is Output.Failure -> {
                }
            }
        }

    }
}
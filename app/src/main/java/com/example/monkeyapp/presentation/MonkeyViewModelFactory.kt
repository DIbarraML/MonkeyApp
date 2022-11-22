package com.example.monkeyapp.presentation

import android.app.Application
import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.monkeyapp.data.remote.MonkeyRemoteDataSource
import com.example.monkeyapp.data.repository.MonkeyRepositoryImpl
import com.example.monkeyapp.data.usecase.GetUserUseCase

class MonkeyViewModelFactory(private val application: Application) :
    AbstractSavedStateViewModelFactory() {
    override fun <T : ViewModel?> create(
        key: String,
        modelClass: Class<T>,
        handle: SavedStateHandle
    ): T {
        return MonkeyViewModel(
            GetUserUseCase(
                MonkeyRepositoryImpl(
                    MonkeyRemoteDataSource(context = application.baseContext)
                )
            )
        ) as T
    }
}
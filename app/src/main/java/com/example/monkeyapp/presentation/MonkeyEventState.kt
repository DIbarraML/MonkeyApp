package com.example.monkeyapp.presentation

sealed class MonkeyEventState() {
    data class ResponseError(val message: String)
}

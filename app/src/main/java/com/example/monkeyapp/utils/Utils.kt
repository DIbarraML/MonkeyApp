package com.example.monkeyapp.utils

import android.content.Context
import android.content.Intent
import androidx.core.content.ContextCompat

fun sendEmail(context: Context) {
    val intent = Intent(Intent.ACTION_SENDTO)
    intent.type = "text/plain"
    intent.putExtra(
        Intent.EXTRA_EMAIL,
        arrayOf("danielibarra0129@gmail.com")
    )
    intent.putExtra(Intent.EXTRA_SUBJECT, "I want a quote")
    intent.putExtra(Intent.EXTRA_TEXT, "I need you to build an application")

    ContextCompat.startActivity(
        context,
        intent,
        null
    )
}
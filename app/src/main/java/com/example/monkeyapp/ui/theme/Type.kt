package com.example.monkeyapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.monkeyapp.R

// Set of Material typography styles to start with
private val fontFamilySerif = FontFamily(
    Font(R.font.dm_serif_display_italic, weight = FontWeight.Bold),
    Font(R.font.dm_serif_display_regular, weight = FontWeight.Normal)
)

private val fontFamilyRubik = FontFamily(
    Font(R.font.rubik_light, weight = FontWeight.Bold)
)

val Typography = Typography(
    body1 = TextStyle(
        fontFamily = fontFamilyRubik,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        textAlign = TextAlign.Center
    ),
    h1 = TextStyle(
        fontFamily = fontFamilySerif,
        fontWeight = FontWeight.Normal,
        fontSize = 32.sp,
        textAlign = TextAlign.Center
    ),
    button = TextStyle(
        fontFamily = fontFamilySerif,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        textAlign = TextAlign.Center,
        color = CyanTextButton
    ),


    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)
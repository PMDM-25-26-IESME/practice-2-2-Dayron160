package com.dayron.vat_calculator_app.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.dayron.vat_calculator_app.R

val BBHSans = FontFamily(
    Font(R.font.bbhsansbogle_regular)
)
val Nunitosans = FontFamily(
    Font(R.font.nunitosans_italic),
    Font(R.font.nunitosans_variablefont, FontWeight.Bold)
)


// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = BBHSans,
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp
    ),
    displayMedium = TextStyle(
        fontFamily = Nunitosans,
        fontWeight = FontWeight.Bold,
        fontSize = 25.sp
    ),
    labelSmall = TextStyle(
        fontFamily = Nunitosans,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = Nunitosans,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
)
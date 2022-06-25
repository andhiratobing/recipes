package com.art.android.themes

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
/**
 * Material 3 Design kit
 * @see
 * [https://www.figma.com/community/file/1035203688168086460]
 * [https://material.io/design/typography/the-type-system.html#type-scale]
 */
val Typography = Typography(
    // Display large style
    displayLarge = TextStyle(
        fontFamily = HeeboFontFamily,
        fontSize = 57.sp,
        lineHeight = 64.sp,
        letterSpacing = 0.sp
    ),
    // Display medium style
    displayMedium = TextStyle(
        fontFamily = HeeboFontFamily,
        fontSize = 45.sp,
        lineHeight = 52.sp,
        letterSpacing = 0.sp
    ),
    // Display small style
    displaySmall = TextStyle(
        fontFamily = HeeboFontFamily,
        fontSize = 36.sp,
        lineHeight = 44.sp,
        letterSpacing = 0.sp
    ),

    // Headline large style
    headlineLarge = TextStyle(
        fontFamily = HeeboFontFamily,
        fontSize = 32.sp,
        lineHeight = 40.sp,
        letterSpacing = 0.sp
    ),
    // Headline medium style
    headlineMedium = TextStyle(
        fontFamily = HeeboFontFamily,
        fontSize = 28.sp,
        lineHeight = 36.sp,
        letterSpacing = 0.sp
    ),
    // Headline small style
    headlineSmall = TextStyle(
        fontFamily = HeeboFontFamily,
        fontSize = 28.sp,
        lineHeight = 36.sp,
        letterSpacing = 0.sp
    ),
    // Body large style
    bodyLarge = TextStyle(
        fontFamily = HeeboFontFamily,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.15.sp
    ),
    // Body medium style
    bodyMedium = TextStyle(
        fontFamily = HeeboFontFamily,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),
    // Body small style
    bodySmall = TextStyle(
        fontFamily = HeeboFontFamily,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.4.sp
    ),
    // Title large style
    titleLarge = TextStyle(
        fontFamily = HeeboFontFamily,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    // Title medium style
    titleMedium = TextStyle(
        fontFamily = HeeboFontFamily,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.15.sp
    ),
    // Title small style
    titleSmall = TextStyle(
        fontFamily = HeeboFontFamily,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    ),
    // Label large style
    labelLarge = TextStyle(
        fontFamily = HeeboFontFamily,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    ),
    // Label medium style
    labelMedium = TextStyle(
        fontFamily = HeeboFontFamily,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
    // Label small style
    labelSmall = TextStyle(
        fontFamily = HeeboFontFamily,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)
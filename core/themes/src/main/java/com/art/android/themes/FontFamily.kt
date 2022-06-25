package com.art.android.themes

import androidx.compose.ui.text.font.*

/**
 * @author andhiratobing
 * @project Recipes
 */

val HeeboFontFamily = FontFamily(
    fonts = listOf(
        Font(
            resId = R.font.heebo_thin,
            weight = FontWeight.Thin,
            style = FontStyle.Normal,
            loadingStrategy = FontLoadingStrategy.Async
        ),
        Font(
            resId = R.font.heebo_light,
            weight = FontWeight.Light,
            style = FontStyle.Normal,
            loadingStrategy = FontLoadingStrategy.Async
        ),
        Font(
            resId = R.font.heebo_extra_light,
            weight = FontWeight.ExtraLight,
            style = FontStyle.Normal,
            loadingStrategy = FontLoadingStrategy.Async
        ),
        Font(
            resId = R.font.heebo_regular,
            weight = FontWeight.Normal,
            loadingStrategy = FontLoadingStrategy.Async
        ),
        Font(
            resId = R.font.heebo_medium,
            weight = FontWeight.Medium,
            loadingStrategy = FontLoadingStrategy.Async
        ),
        Font(
            resId = R.font.heebo_bold,
            weight = FontWeight.Bold,
            loadingStrategy = FontLoadingStrategy.Async
        ),
        Font(
            resId = R.font.heebo_semi_bold,
            weight = FontWeight.SemiBold,
            loadingStrategy = FontLoadingStrategy.Async
        ),
        Font(
            resId = R.font.heebo_extra_bold,
            weight = FontWeight.ExtraBold,
            loadingStrategy = FontLoadingStrategy.Async
        ),
        Font(
            resId = R.font.heebo_black,
            weight = FontWeight.Black,
            loadingStrategy = FontLoadingStrategy.Async
        )
    )
)
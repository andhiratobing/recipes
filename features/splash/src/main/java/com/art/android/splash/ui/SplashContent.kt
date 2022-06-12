package com.art.android.splash.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.art.android.components.lottie.ArtLottie
import com.art.android.splash.R

/**
 * @author andhiratobing
 * @project Recipes
 */

@Composable
fun SplashContent(
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.fillMaxSize(),
        content = {
            ArtLottie(
                resource = R.raw.splash_food
            )
        }
    )
}
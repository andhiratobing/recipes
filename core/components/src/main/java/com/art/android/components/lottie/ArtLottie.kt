package com.art.android.components.lottie

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.airbnb.lottie.compose.*
import com.art.android.abstraction.UnitLambda

/**
 * @author andhiratobing
 * @project Recipes
 */

@Composable
fun ArtLottie(
    modifier: Modifier = Modifier,
    contentAlignment: Alignment = Alignment.Center,
    isPlaying: Boolean = true,
    animationSpeed: Float = 2f,
    iterations: Int = LottieConstants.IterateForever,
    restartOnPlay: Boolean = false,
    resource: Int,
    dismissOnBackPress: Boolean = false,
    dismissOnClickOutside: Boolean = false,
    onDismissRequest: UnitLambda = {},
    forDialog: Boolean = false
) {
    val composition by rememberLottieComposition(
        spec = LottieCompositionSpec.RawRes(resource)
    )
    val progress by animateLottieCompositionAsState(
        composition = composition,
        isPlaying = isPlaying,
        speed = animationSpeed,
        iterations = iterations,
        restartOnPlay = restartOnPlay
    )

    Box(
        modifier = modifier,
        contentAlignment = contentAlignment,
        content = {
            if (forDialog) {
                Dialog(
                    properties = DialogProperties(
                        dismissOnBackPress = dismissOnBackPress,
                        dismissOnClickOutside = dismissOnClickOutside
                    ),
                    onDismissRequest = onDismissRequest,
                    content = {
                        LottieAnimation(
                            composition = composition,
                            progress = progress
                        )
                    }
                )
            } else {
                LottieAnimation(
                    composition = composition,
                    progress = progress
                )
            }
        }
    )
}
package com.art.android.components.spacer

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

/**
 * @author andhiratobing
 * @project Recipes
 */

@Composable
fun ArtVerticalSpace(dp: Dp) {
    Spacer(modifier = Modifier.height(dp))
}

@Composable
fun ArtHorizontalSpacer(dp: Dp) {
    Spacer(modifier = Modifier.width(dp))
}
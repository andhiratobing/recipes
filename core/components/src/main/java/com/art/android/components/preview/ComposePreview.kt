package com.art.android.components.preview

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Device
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.UiMode

/**
 * @author andhiratobing
 * @project Recipes
 */

/**
 * Setting the parameter write value preview
 */
object ComposePreview {

    const val LIGHT_PREVIEW_NAME: String = "Light"
    const val DARK_PREVIEW_NAME: String = "Dark"
    const val SHOW_BACKGROUND: Boolean = true
    const val BACKGROUND_COLOR: Long = 0

    @UiMode
    const val MODE_LIGHT: Int = Configuration.UI_MODE_NIGHT_NO

    @UiMode
    const val MODE_DARK: Int = Configuration.UI_MODE_NIGHT_YES

    @Device
    const val DEVICE_MODE_MOBILE: String = Devices.PIXEL_2

    @Device
    const val DEVICE_MODE_TABLET: String = Devices.NEXUS_9
}
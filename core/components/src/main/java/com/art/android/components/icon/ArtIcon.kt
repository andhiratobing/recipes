package com.art.android.components.icon

import androidx.annotation.DrawableRes
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.art.android.abstraction.UnitLambda
import com.art.android.components.preview.ComposePreview
import com.art.android.components.tag.tag
import com.art.android.themes.RecipesTheme

/**
 * @author andhiratobing
 * @project Recipes
 */

@Composable
fun ArtIcon(
    modifier: Modifier = Modifier,
    isEnabledClickIcon: Boolean = false,
    onClickIcon: UnitLambda = {},
    icon: ImageVector? = null,
    tintIcon: Color = MaterialTheme.colorScheme.onBackground,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    colors: IconButtonColors = IconButtonDefaults.iconButtonColors(),
    tagName: String? = null
) {
    IconButton(
        modifier = modifier.tag(tagName.orEmpty()),
        enabled = isEnabledClickIcon,
        interactionSource = interactionSource,
        colors = colors,
        onClick = onClickIcon,
        content = {
            icon?.let { icon ->
                Icon(
                    imageVector = icon,
                    contentDescription = tagName.orEmpty(),
                    tint = tintIcon
                )
            }
        }
    )
}

@Composable
fun ArtIconDrawable(
    modifier: Modifier = Modifier,
    isEnabledClickIcon: Boolean = false,
    onClickIcon: UnitLambda = {},
    @DrawableRes icon: Int? = null,
    tintIcon: Color = MaterialTheme.colorScheme.onBackground,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    colors: IconButtonColors = IconButtonDefaults.iconButtonColors(),
    tagName: String? = null
) {
    IconButton(
        modifier = modifier.tag(tagName.orEmpty()),
        enabled = isEnabledClickIcon,
        interactionSource = interactionSource,
        colors = colors,
        onClick = onClickIcon,
        content = {
            icon?.let { icon ->
                Icon(
                    painter = painterResource(id = icon),
                    contentDescription = tagName.orEmpty(),
                    tint = tintIcon
                )
            }
        }
    )
}

@Preview(
    name = ComposePreview.LIGHT_PREVIEW_NAME,
    showBackground = ComposePreview.SHOW_BACKGROUND,
    uiMode = ComposePreview.MODE_LIGHT
)
@Preview(
    name = ComposePreview.DARK_PREVIEW_NAME,
    showBackground = ComposePreview.SHOW_BACKGROUND,
    uiMode = ComposePreview.MODE_DARK
)
@Composable
private fun ArtIconPreview() {
    RecipesTheme {
        Surface(
            contentColor = MaterialTheme.colorScheme.onBackground
        ) {
            ArtIcon(
                isEnabledClickIcon = true,
                icon = Icons.Filled.Settings
            )
        }
    }
}
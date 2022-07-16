package com.art.android.components.button


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.art.android.abstraction.UnitLambda
import com.art.android.components.icon.ArtIcon
import com.art.android.components.preview.ComposePreview
import com.art.android.components.tag.tag
import com.art.android.components.text.ArtText
import com.art.android.themes.RecipesTheme

/**
 * @author andhiratobing
 * @project Recipes
 */

@Composable
fun ArtButton(
    modifier: Modifier = Modifier,
    onClick: UnitLambda = {},
    enabled: Boolean = false,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    elevation: ButtonElevation? = ButtonDefaults.buttonElevation(),
    shape: Shape = MaterialTheme.shapes.medium,
    border: BorderStroke? = null,
    colors: ButtonColors = ButtonDefaults.buttonColors(),
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    tagButtonName: String? = null,
    text: String,
    textAlign: TextAlign = TextAlign.Start,
    tagTextName: String? = null,
    colorText: Color = MaterialTheme.colorScheme.onSurface,
    maxLine: Int = 1,
    styleText: TextStyle = MaterialTheme.typography.titleSmall,
    isShowIconStart: Boolean = false,
    iconStart: ImageVector? = null,
    tagIconStart: String? = null,
    isShowIconEnd: Boolean = false,
    iconEnd: ImageVector? = null,
    tagIconEnd: String? = null
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            modifier = modifier
                .tag(tagButtonName.orEmpty())
                .defaultMinSize(
                    minWidth = ButtonDefaults.MinWidth,
                    minHeight = ButtonDefaults.MinHeight
                )
                .padding(contentPadding),
            onClick = onClick,
            enabled = enabled,
            interactionSource = interactionSource,
            elevation = elevation,
            shape = shape,
            border = border,
            colors = colors,
            contentPadding = contentPadding
        ) {
            if (isShowIconStart) {
                iconStart?.let {
                    ArtIcon(
                        modifier = modifier,
                        icon = iconStart,
                        tagName = tagIconStart
                    )
                }
            }

            ArtText(
                modifier = modifier.tag(tagTextName.orEmpty()),
                text = text,
                textAlign = textAlign,
                color = colorText,
                maxLines = maxLine,
                style = styleText,
            )

            if (isShowIconEnd) {
                iconEnd?.let {
                    ArtIcon(
                        modifier = modifier,
                        icon = iconEnd,
                        tagName = tagIconEnd
                    )
                }
            }
        }
    }
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
private fun ArtButtonPreviewTextButton() {
    RecipesTheme {
        Surface(
            contentColor = MaterialTheme.colorScheme.onBackground
        ) {
            ArtButton(
                text = "Art Button"
            )
        }
    }
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
private fun ArtButtonPreviewWithIconStart() {
    RecipesTheme {
        Surface(
            contentColor = MaterialTheme.colorScheme.onBackground
        ) {
            ArtButton(
                text = "Art Button",
                isShowIconStart = true,
                iconStart = Icons.Outlined.Favorite
            )
        }
    }
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
fun ArtButtonPreviewWithIconEnd() {
    RecipesTheme {
        Surface(
            contentColor = MaterialTheme.colorScheme.onBackground
        ) {
            ArtButton(
                text = "Art Button",
                isShowIconEnd = true,
                iconEnd = Icons.Outlined.Favorite
            )
        }
    }
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
private fun ArtButtonPreviewWithIconStartAndIconEnd() {
    RecipesTheme {
        Surface(
            contentColor = MaterialTheme.colorScheme.onBackground
        ) {
            ArtButton(
                text = "Art Button",
                isShowIconStart = true,
                iconStart = Icons.Outlined.Favorite,
                isShowIconEnd = true,
                iconEnd = Icons.Outlined.Favorite
            )
        }
    }
}
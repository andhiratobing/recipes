package com.art.android.components.list.item

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.art.android.components.icon.ArtIcon
import com.art.android.components.preview.ComposePreview
import com.art.android.components.text.ArtText
import com.art.android.themes.RecipesTheme

/**
 * @author andhiratobing
 * @project Recipes
 */

@Composable
fun ArtTextTwoLine(
    modifier: Modifier = Modifier,
    contentAlignment: Alignment = Alignment.Center,
    textFirst: String,
    textFirstAlign: TextAlign = TextAlign.Start,
    styleTextFirst: TextStyle = MaterialTheme.typography.headlineSmall,
    colorTextFirst: Color = MaterialTheme.colorScheme.onBackground,
    maxLineTextFirst: Int = 1,
    overflowTextFirst: TextOverflow = TextOverflow.Ellipsis,
    tagFirstName: String? = null,
    textSecond: String? = null,
    textSecondAlign: TextAlign = TextAlign.Start,
    styleTextSecond: TextStyle = MaterialTheme.typography.headlineSmall,
    colorTextSecond: Color = MaterialTheme.colorScheme.onBackground,
    maxLineTextSecond: Int = Int.MAX_VALUE,
    overflowTextSecond: TextOverflow = TextOverflow.Ellipsis,
    tagSecondName: String? = null,
    trailingIcon: ImageVector? = null,
    tintIcon: Color = MaterialTheme.colorScheme.onBackground,
    tagNameIcon: String? = null,
    paddingValues: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 16.dp)
) {
    BoxWithConstraints(
        modifier = modifier,
        contentAlignment = contentAlignment,
        content = {
            Row(
                modifier = modifier.padding(
                    paddingValues = paddingValues
                ),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    modifier = modifier.weight(1f),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = modifier,
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.Start
                    ) {
                        // Title text
                        ArtText(
                            modifier = modifier,
                            text = textFirst,
                            style = styleTextFirst,
                            textAlign = textFirstAlign,
                            color = colorTextFirst,
                            maxLines = maxLineTextFirst,
                            overflow = overflowTextFirst,
                            tagName = tagFirstName
                        )

                        // Description text
                        textSecond?.let {
                            ArtText(
                                modifier = modifier,
                                text = it,
                                style = styleTextSecond,
                                textAlign = textSecondAlign,
                                color = colorTextSecond,
                                maxLines = maxLineTextSecond,
                                overflow = overflowTextSecond,
                                tagName = tagSecondName
                            )
                        }
                    }

                    BoxWithConstraints(
                        modifier = modifier.weight(1f),
                        contentAlignment = Alignment.CenterEnd,
                        content = {
                            // Trailing icon
                            ArtIcon(
                                modifier = modifier,
                                icon = trailingIcon,
                                isEnabledClickIcon = false,
                                tintIcon = tintIcon,
                                tagName = tagNameIcon
                            )
                        }
                    )
                }
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
private fun ArtTextTwoLinePreview() {
    RecipesTheme {
        Surface(
            contentColor = MaterialTheme.colorScheme.onBackground
        ) {
            ArtTextTwoLine(
                textFirst = "Art title",
                textSecond = "Art description"
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
private fun ArtTextTwoLineWithTrailingIconPreview() {
    RecipesTheme {
        Surface(
            contentColor = MaterialTheme.colorScheme.onBackground
        ) {
            ArtTextTwoLine(
                textFirst = "Art title",
                textSecond = "Art description",
                trailingIcon = Icons.Outlined.Add
            )
        }
    }
}
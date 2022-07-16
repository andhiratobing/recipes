package com.art.android.components.text

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import com.art.android.components.preview.ComposePreview
import com.art.android.components.tag.tag
import com.art.android.themes.RecipesTheme

/**
 * @author andhiratobing
 * @project Recipes
 */

@Composable
fun ArtText(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign = TextAlign.Start,
    maxLines: Int = Int.MAX_VALUE,
    style: TextStyle = MaterialTheme.typography.titleSmall,
    letterSpacing: TextUnit = TextUnit.Companion.Unspecified,
    textDecoration: TextDecoration? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    tagName: String? = null,
    onTextLayout: (TextLayoutResult) -> Unit = {},
) {
    Surface(
        modifier = modifier,
        contentColor = MaterialTheme.colorScheme.onSurface
    ) {
        Text(
            modifier = modifier.tag(tagName.orEmpty()),
            text = text,
            textAlign = textAlign,
            style = style,
            color = color,
            maxLines = maxLines,
            letterSpacing = letterSpacing,
            textDecoration = textDecoration,
            overflow = overflow,
            softWrap = softWrap,
            onTextLayout = onTextLayout
        )
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
fun ArtTextPreview() {
    RecipesTheme {
        ArtText(
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
        )
    }
}
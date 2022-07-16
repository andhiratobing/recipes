package com.art.android.components.top_bar

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.art.android.abstraction.UnitLambda
import com.art.android.components.R
import com.art.android.components.icon.ArtIcon
import com.art.android.components.text.ArtText
import com.art.android.themes.RecipesTheme
import com.art.android.themes.Typography

/**
 * @author andhiratobing
 * @project Recipes
 */

@Composable
fun ArtTopAppBar(
    modifier: Modifier = Modifier,
    title: String? = null,
    titleColor: Color = MaterialTheme.colorScheme.onBackground,
    titleOverflow: TextOverflow = TextOverflow.Clip,
    isCenteredTitle: Boolean = false,
    navigationIcon: @Composable (() -> Unit)? = null,
    onBackPressed: UnitLambda = {},
    isShowNavigationIcon: Boolean = false,
    iconNavigation: ImageVector = Icons.Filled.ArrowBack,
    isShowSingleIconAction: Boolean = false,
    isEnabledClickIconAction: Boolean = true,
    onClickIconAction: UnitLambda = {},
    iconAction: ImageVector? = null,
    tintIconAction: Color = MaterialTheme.colorScheme.onBackground,
    tagName: String? = null,
    isEnabledClickIconActionTwo: Boolean = true,
    onClickIconActionTwo: UnitLambda = {},
    iconActionTwo: ImageVector? = null,
    tintIconActionTwo: Color = MaterialTheme.colorScheme.onBackground,
    isShowDoubleIconAction: Boolean = false,
    actions: @Composable RowScope.() -> Unit = {},
    topAppBarColors: TopAppBarColors = TopAppBarDefaults.smallTopAppBarColors(),
    maxLines: Int = 1,
    interactionSource: MutableInteractionSource = remember {
        MutableInteractionSource()
    },
    interactionSourceTwo: MutableInteractionSource = remember {
        MutableInteractionSource()
    },
    iconButtonColors: IconButtonColors = IconButtonDefaults.iconButtonColors(),
    iconButtonColorsTwo: IconButtonColors = IconButtonDefaults.iconButtonColors()
) {
    SmallTopAppBar(
        modifier = modifier,
        title = {
            title?.let { title ->
                ArtText(
                    text = title,
                    maxLines = maxLines,
                    color = titleColor,
                    overflow = titleOverflow,
                    style = Typography.titleMedium,
                    textAlign = if (isCenteredTitle) TextAlign.Center else TextAlign.Start
                )
            }
        },
        navigationIcon = {
            if (isShowNavigationIcon) {
                IconButton(
                    // On click navigation icon
                    onClick = { onBackPressed.invoke() },
                    content = {
                        Icon(
                            imageVector = iconNavigation,
                            contentDescription = stringResource(id = R.string.navigation_icon),
                            tint = MaterialTheme.colorScheme.onBackground
                        )
                    }
                )
            } else {
                navigationIcon?.invoke()
            }
        },
        actions = {
            when {
                isShowSingleIconAction -> {
                    ArtIcon(
                        modifier = modifier,
                        isEnabledClickIcon = isEnabledClickIconAction,
                        onClickIcon = onClickIconAction,
                        icon = iconAction,
                        interactionSource = interactionSource,
                        tintIcon = tintIconAction,
                        colors = iconButtonColors,
                        tagName = tagName
                    )
                }
                isShowDoubleIconAction -> {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        content = {
                            ArtIcon(
                                modifier = modifier,
                                isEnabledClickIcon = isEnabledClickIconAction,
                                onClickIcon = onClickIconAction,
                                icon = iconAction,
                                interactionSource = interactionSource,
                                tintIcon = tintIconAction,
                                colors = iconButtonColors,
                                tagName = tagName
                            )

                            ArtIcon(
                                modifier = modifier,
                                isEnabledClickIcon = isEnabledClickIconActionTwo,
                                onClickIcon = onClickIconActionTwo,
                                icon = iconActionTwo,
                                interactionSource = interactionSourceTwo,
                                colors = iconButtonColorsTwo,
                                tintIcon = tintIconActionTwo,
                                tagName = tagName
                            )
                        }
                    )
                }
                else -> actions.invoke(this)
            }
        },
        colors = topAppBarColors
    )
}

private val navigationIcon = Icons.Filled.ArrowBack
private val favoriteIcon = Icons.Filled.Favorite
private val settingIcon = Icons.Filled.Settings

@Preview(
    name = "Light mode",
    backgroundColor = 1,
    uiMode = UI_MODE_NIGHT_NO
)
@Preview(
    name = "Dark mode",
    backgroundColor = 1,
    uiMode = UI_MODE_NIGHT_YES
)
@Composable
private fun ArtTopAppBarPreviewWithoutNavigationIcon() {
    RecipesTheme {
        ArtTopAppBar(
            title = "Top app bar",
            isShowNavigationIcon = false
        )
    }
}

@Preview(
    name = "Light mode",
    backgroundColor = 1,
    uiMode = UI_MODE_NIGHT_NO
)
@Preview(
    name = "Dark mode",
    backgroundColor = 1,
    uiMode = UI_MODE_NIGHT_YES
)
@Composable
private fun ArtTopAppBarPreviewWithNavigationIcon() {
    RecipesTheme {
        ArtTopAppBar(
            title = "Top app bar",
            isShowNavigationIcon = true,
            iconNavigation = navigationIcon
        )
    }
}


@Preview(
    name = "Light mode",
    backgroundColor = 1,
    uiMode = UI_MODE_NIGHT_NO
)
@Preview(
    name = "Dark mode",
    backgroundColor = 1,
    uiMode = UI_MODE_NIGHT_YES
)
@Composable
private fun ArtTopAppBarPreview() {
    RecipesTheme {
        ArtTopAppBar(
            title = "Top app bar",
            isShowNavigationIcon = true,
            iconNavigation = navigationIcon,
            isShowSingleIconAction = true,
            isEnabledClickIconAction = true,
            iconAction = favoriteIcon,
            onClickIconAction = {},
        )
    }
}


@Preview(
    name = "Light mode",
    backgroundColor = 1,
    uiMode = UI_MODE_NIGHT_NO
)
@Preview(
    name = "Dark mode",
    backgroundColor = 1,
    uiMode = UI_MODE_NIGHT_YES
)
@Composable
private fun ArtTopAppBarPreviewDoubleIconAction() {
    RecipesTheme {
        ArtTopAppBar(
            title = "Top app bar",
            isShowNavigationIcon = true,
            iconNavigation = navigationIcon,
            isShowDoubleIconAction = true,
            isEnabledClickIconAction = true,
            iconAction = favoriteIcon,
            onClickIconAction = {},
            isEnabledClickIconActionTwo = true,
            iconActionTwo = settingIcon,
            onClickIconActionTwo = {},
        )
    }
}
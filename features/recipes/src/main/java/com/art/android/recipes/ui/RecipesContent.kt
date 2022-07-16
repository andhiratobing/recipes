package com.art.android.recipes.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.art.android.components.preview.ComposePreview
import com.art.android.components.tag.tag
import com.art.android.components.text.ArtText
import com.art.android.recipes.domain.models.Recipe
import com.art.android.recipes.ui.state.RecipesUiState
import com.art.android.themes.RecipesTheme

/**
 * @author andhiratobing
 * @project RecipesRepository
 */

@ExperimentalMaterial3Api
@Composable
fun RecipesContent(
    modifier: Modifier = Modifier,
    uiState: RecipesUiState
) {
    Surface(
        modifier = modifier,
        contentColor = MaterialTheme.colorScheme.onBackground
    ) {
        Card(
            modifier = modifier.padding(
                horizontal = 16.dp,
                vertical = 8.dp
            ),
            shape = MaterialTheme.shapes.medium,
            colors = CardDefaults.cardColors(
                contentColor = MaterialTheme.colorScheme.onPrimary
            ),
            content = {
                Row(
                    modifier = modifier,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        modifier = modifier,
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        content = {
                            // Title
                            ArtText(
                                modifier = modifier.tag("titleRecipe"),
                                text = uiState.recipe.title,
                                maxLines = 2,
                                overflow = TextOverflow.Ellipsis
                            )
                        }
                    )

                    Box(
                        modifier = modifier
                    ) {

                    }
                }
            }
        )
    }
}


@ExperimentalMaterial3Api
@Preview(
    name = ComposePreview.LIGHT_PREVIEW_NAME,
    showBackground = ComposePreview.SHOW_BACKGROUND,
    uiMode = ComposePreview.MODE_LIGHT,
    device = ComposePreview.DEVICE_MODE_MOBILE
)

@Preview(
    name = ComposePreview.DARK_PREVIEW_NAME,
    showBackground = ComposePreview.SHOW_BACKGROUND,
    uiMode = ComposePreview.MODE_DARK,
    device = ComposePreview.DEVICE_MODE_MOBILE
)
@Composable
fun RecipesContentPreview() {
    RecipesTheme {
        RecipesContent(
            uiState = RecipesUiState(
                recipe = Recipe(
                    id = 0,
                    image = "",
                    imageType = "",
                    title = "Cauliflower, Brown Rice, and Vegetable Fried Rice"
                )
            )
        )
    }
}
package com.art.android.components.tag

import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.SemanticsPropertyReceiver
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTag

/**
 * @author andhiratobing
 * @project Recipes
 * Applies a tag to allow modified element to be found in tests.
 *
 * This is a convenience method for a [semantics] that sets [SemanticsPropertyReceiver.testTag].
 */

@Stable
fun Modifier.tag(name: String) = this.then(
    semantics(
        properties = {
            testTag = name
            contentDescription = name
        }
    )
)
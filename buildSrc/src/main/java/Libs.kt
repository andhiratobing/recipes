object Libs {

    // Android group, name, include version dependencies
    object Android {
        const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX_VERSION}"
    }

    // Compose group, name, include version dependencies
    object Compose {
        const val COMPOSE_COMPILER =
            "androidx.compose.compiler:compiler:${Versions.COMPOSE_COMPILER_VERSION}"
        const val COMPOSE_UI = "androidx.compose.ui:ui:${Versions.COMPOSE_UI_VERSION}"
        const val COMPOSE_MATERIAL =
            "androidx.compose.material:material:${Versions.COMPOSE_MATERIAL_VERSION}"
        const val COMPOSE_UI_TOOLING =
            "androidx.compose.ui:ui-tooling:${Versions.COMPOSE_UI_TOOLING_VERSION}"
        const val COMPOSE_UI_TOOLING_PREVIEW =
            "androidx.compose.ui:ui-tooling-preview:${Versions.COMPOSE_UI_TOOLING_VERSION}"
        const val COMPOSE_FOUNDATION =
            "androidx.compose.foundation:foundation:${Versions.COMPOSE_FOUNDATION_VERSION}}"
        const val COMPOSE_RUNTIME =
            "androidx.compose.runtime:runtime:${Versions.COMPOSE_RUNTIME_VERSION}"
        const val COMPOSE_CONSTRAINT_LAYOUT =
            "androidx.constraintlayout:constraintlayout-compose:${Versions.COMPOSE_CONSTRAINT_LAYOUT_VERSION}"
        const val COMPOSE_NAVIGATION =
            "androidx.navigation:navigation-compose:${Versions.COMPOSE_NAVIGATION_VERSION}"
        const val COMPOSE_COIL = "io.coil-kt:coil-compose:${Versions.COMPOSE_COIL_VERSION}"
        const val COMPOSE_LOTTIE = "com.airbnb.android:lottie-compose:${Versions.LOTTIE_VERSION}"
    }

    // Google accompanist  group, name, include version dependencies
    object Accompanist {
        const val accompanistUiController =
            "com.google.accompanist:accompanist-systemuicontroller:${Versions.ACCOMPANIST_SYSTEM_UI_CONTROLLER}"
        const val accompanistPager =
            "com.google.accompanist:accompanist-pager:${Versions.ACCOMPANIST_PAGER}"
        const val accompanistPagerIndicator =
            "com.google.accompanist:accompanist-pager-indicators:${Versions.ACCOMPANIST_PAGER_INDICATOR}"
    }

    // Lifecycle group, name, include version dependencies
    object Lifecycle {
        const val LIFECYCLE_RUNTIME_KTX =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE_RUNTIME_KTX_VERSION}"
        const val LIFECYCLE_VIEW_MODEL_KTX =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE_VIEW_MODEL_KTX_VERSION}"
        const val LIFECYCLE_VIEW_MODEL_COMPOSE =
            "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.LIFECYCLE_VIEW_MODEL_COMPOSE_VERSION}"
    }

    // Dagger hilt group, name, include version dependencies
    object DaggerHilt {
        const val DAGGER_HILT_NAVIGATION_COMPOSE =
            "androidx.hilt:hilt-navigation-compose:${Versions.DAGGER_HILT_NAVIGATION_COMPOSE_VERSION}"
        const val DAGGER_HILT_ANDROID =
            "com.google.dagger:hilt-android:${Versions.DAGGER_HILT_ANDROID_VERSION}"
        const val DAGGER_HILT_COMPILER =
            "com.google.dagger:hilt-android-compiler:${Versions.DAGGER_HILT_ANDROID_VERSION}"
    }

    // Kotlin coroutine group, name, include version dependencies
    object Coroutine {
        const val COROUTINE_CORE =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINE_VERSION}"
        const val COROUTINE_ANDROID =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINE_VERSION}"
    }

    // Retrofit group, name, include version dependencies
    object Retrofit {
        const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT_VERSION}"
    }

    // Okhttp group, name, include version dependencies
    object Okhttp {
        const val OKHTTP = "com.squareup.okhttp3:okhttp:${Versions.OKHTTP_VERSION}"
        const val OKHTTP_LOGGING_INTERCEPTOR =
            "com.squareup.okhttp3:logging-interceptor:${Versions.OKHTTP_VERSION}"
    }

    // Room group, name, include version dependencies
    object RoomDatabase {
        const val ROOM_RUNTIME = "androidx.room:room-runtime:${Versions.ROOM_DATABASE_VERSION}"
        const val ROOM_COMPILER = "androidx.room:room-compiler:${Versions.ROOM_DATABASE_VERSION}"

    }

    // Datastore group, name, include version dependencies
    object DataStore {
        const val DATA_STORE_CORE =
            "androidx.datastore:datastore-preferences-core${Versions.DATA_STORE_VERSION}"
        const val DATA_STORE =
            "androidx.datastore:datastore-preferences:${Versions.DATA_STORE_VERSION}"
    }
}
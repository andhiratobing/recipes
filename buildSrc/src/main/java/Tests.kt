object Tests {
    // Test implementation
    const val JUNIT = "junit:junit:${Versions.JUNIT_VERSION}"

    // Android test implementation
    const val EXT_JUNIT = "androidx.test.ext:junit:${Versions.EXT_JUNIT_VERSION}"
    const val ESPRESSO_CORE =
        "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_CORE_VERSION}"
    const val COMPOSE_UI = "androidx.compose.ui:ui-test-junit4:${Versions.COMPOSE_UI_VERSION}"

    // Kotlin
    const val KOTLIN_JUNIT5_TEST = "org.jetbrains.kotlin:kotlin-test-junit5:${Versions.KOTLIN_VERSION_JUNIT5}"

    // Kotlin coroutine
    const val COROUTINE_TEST =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.COROUTINE_VERSION}"

    // Dagger hilt
    const val DAGGER_HILT_TEST =
        "com.google.dagger:hilt-android-testing:${Versions.DAGGER_HILT_ANDROID_VERSION}"

    // MocKK
    const val MOCKK_TEST = "io.mockk:mockk:${Versions.MOCKK_VERSION}"

    const val MOCK_WEB_SERVER_TEST =
        "com.squareup.okhttp3:mockwebserver:${Versions.MOCK_WEB_SERVER_VERSION}"

    const val GOOGLE_TRUTH_TEST = "com.google.truth:truth:${Versions.GOOGLE_TRUTH_VERSION}"
}
// Android core
internal val androidOfficialDependencies = listOf(
    Libs.Android.CORE_KTX
)

// Compose core ui
internal val composeOfficialDependencies = listOf(
    Libs.Compose.COMPOSE_COMPILER,
    Libs.Compose.COMPOSE_FOUNDATION,
    Libs.Compose.COMPOSE_MATERIAL,
    Libs.Compose.COMPOSE_RUNTIME,
    Libs.Compose.COMPOSE_UI,
    Libs.Compose.COMPOSE_CONSTRAINT_LAYOUT,
    Libs.Compose.COMPOSE_NAVIGATION,
    Libs.Compose.COMPOSE_UI_TOOLING,
    Libs.Compose.COMPOSE_UI_TOOLING_PREVIEW
)

// Compose ui third party
internal const val composeUiExternalDependencies = Libs.Accompanist.accompanistUiController

internal val composePagerDependencies = listOf(
    Libs.Accompanist.accompanistPager,
    Libs.Accompanist.accompanistPagerIndicator
)

// Image loader Third party
internal const val coilDependencies = Libs.Compose.COMPOSE_COIL

// Animation Third party
internal const val lottieDependency = Libs.Compose.COMPOSE_LOTTIE


// Kotlin coroutine
internal val kotlinCoroutineDependencies = listOf(
    Libs.Coroutine.COROUTINE_ANDROID,
    Libs.Coroutine.COROUTINE_CORE
)

// Lifecycle
internal val lifecycleViewModelDependencies = listOf(
    Libs.Lifecycle.LIFECYCLE_RUNTIME_KTX,
    Libs.Lifecycle.LIFECYCLE_VIEW_MODEL_KTX,
    Libs.Lifecycle.LIFECYCLE_VIEW_MODEL_COMPOSE
)

// Network
internal val networkDependencies = listOf(
    Libs.Ktor.KTOR_CORE,
    Libs.Ktor.KTOR_ANDROID,
    Libs.Ktor.KTOR_SERIALIZATION,
    Libs.Ktor.KTOR_CONTENT_NEGOTIATION,
    Libs.Ktor.KTOR_RESOURCE,
    Libs.Ktor.KTOR_LOGGING
)

// Local database
internal val databaseDependencies = listOf(
    Libs.RoomDatabase.ROOM_RUNTIME,
    Libs.RoomDatabase.ROOM_COMPILER
)

// Local preferences
internal val datastoreDependencies = listOf(
    Libs.DataStore.DATA_STORE,
    Libs.DataStore.DATA_STORE_CORE
)

// Dagger hilt
internal val daggerHiltDependencies = listOf(
    Libs.DaggerHilt.DAGGER_HILT_ANDROID,
    Libs.DaggerHilt.DAGGER_HILT_NAVIGATION_COMPOSE,
    Libs.DaggerHilt.DAGGER_HILT_COMPILER
)

// Android instrumentation test
internal val androidInstrumentationTestDependencies = listOf(
    Tests.EXT_JUNIT,
    Tests.ESPRESSO_CORE,
    Tests.COMPOSE_UI
)

// Unit test
internal val unitTestDependencies = listOf(
    Tests.JUNIT
)

// Debug
internal const val debugDependencies = Debugs.COMPOSE_UI_TOOLING
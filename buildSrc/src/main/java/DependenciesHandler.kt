import org.gradle.api.artifacts.dsl.DependencyHandler

const val IMPLEMENTATION = "implementation"
const val KAPT = "kapt"
const val TEST_IMPLEMENTATION = "testImplementation"
const val ANDROID_TEST_INSTRUMENTATION = "androidTestImplementation"
const val DEBUG_IMPLEMENTATION = "debugImplementation"

/**
 * Android core
 */
fun DependencyHandler.implementationAndroidCore() {
    androidOfficialDependencies.forEach { add(IMPLEMENTATION, it) }
}

/**
 * Compose ui
 */
fun DependencyHandler.implementationComposeUi() {
    composeOfficialDependencies.forEach { add(IMPLEMENTATION, it) }
    composeUiExternalDependencies.forEach { add(IMPLEMENTATION, it) }
}

/**
 * Accompanist pager
 */
fun DependencyHandler.implementationPager() {
    composePagerDependencies.forEach { add(IMPLEMENTATION, it) }
}

/**
 * Coil for image loader
 */
fun DependencyHandler.implementationCoil() {
    coilDependencies.forEach { add(IMPLEMENTATION, it) }
}

/**
 * Animation
 */
fun DependencyHandler.implementationLottie() {
    lottieDependency.forEach { add(IMPLEMENTATION, it) }
}

/**
 * Kotlin coroutine
 */
fun DependencyHandler.implementationKotlinCoroutine() {
    kotlinCoroutineDependencies.forEach { add(IMPLEMENTATION, it) }
}

/**
 * Network
 */
fun DependencyHandler.apiNetwork() {
    networkDependencies.forEach { add(IMPLEMENTATION, it) }
}

/**
 * Database
 */
fun DependencyHandler.implementationDatabase() {
    databaseDependencies.forEach {
        add(IMPLEMENTATION, it)
        add(KAPT, it)
    }
}

/**
 * Preference
 */
fun DependencyHandler.implementationPreference() {
    datastoreDependencies.forEach { add(IMPLEMENTATION, it) }
}

/**
 * Lifecycle
 */
fun DependencyHandler.implementationLifecycleViewModel() {
    lifecycleViewModelDependencies.forEach { add(IMPLEMENTATION, it) }
}

/**
 * Dagger hilt
 */
fun DependencyHandler.implementationDaggerHilt() {
    daggerHiltDependencies.forEach {
        add(IMPLEMENTATION, it)
        add(KAPT, it)
    }
}

/**
 * Unit test
 */
fun DependencyHandler.testImplementation() {
    unitTestDependencies.forEach { add(TEST_IMPLEMENTATION, it) }
}

/**
 * Instrumentation test
 */
fun DependencyHandler.androidTestImplementation() {
    androidInstrumentationTestDependencies.forEach { add(ANDROID_TEST_INSTRUMENTATION, it) }
}

fun DependencyHandler.debugImplementation() {
    debugDependencies.forEach { add(DEBUG_IMPLEMENTATION, it) }
}
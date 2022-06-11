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
    composeOfficialDependencies.plus(Libs.Accompanist.accompanistUiController)
        .plus(Libs.DaggerHilt.DAGGER_HILT_NAVIGATION_COMPOSE)
        .forEach { add(IMPLEMENTATION, it) }
}

/**
 * Accompanist pager
 */
fun DependencyHandler.implementationPager() {
    composePagerDependencies.forEach { add(IMPLEMENTATION, it) }
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
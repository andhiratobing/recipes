import org.gradle.api.artifacts.dsl.DependencyHandler
import org.jetbrains.kotlin.gradle.utils.API
import org.jetbrains.kotlin.gradle.utils.IMPLEMENTATION

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
    networkDependencies.forEach { add(API, it) }
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
    unitTestDependencies.forEach { add("testImplementation", it) }
}

/**
 * Instrumentation test
 */
fun DependencyHandler.androidTestImplementation() {
    androidInstrumentationTestDependencies.forEach { add("androidTestImplementation", it) }
}

fun DependencyHandler.debugImplementation() {
    debugDependencies.forEach { add("debugImplementation", it) }
}
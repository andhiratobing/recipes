plugins {
    id("common-kotlin-plugin")
}

dependencies {

    implementation(project(Modules.LIBRARY_NETWORK))

    implementationKotlinCoroutine()

    implementation(Libs.DaggerHilt.DAGGER_HILT_ANDROID)
    kapt(Libs.DaggerHilt.DAGGER_HILT_COMPILER)
}
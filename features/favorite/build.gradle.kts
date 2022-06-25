plugins {
    id("common-compose-plugin")
    id("dagger.hilt.android.plugin")
}

dependencies {

    implementation(project(Modules.CORE_NAVIGATION))
    implementation(project(Modules.CORE_COMPONENTS))
    implementation(project(Modules.CORE_THEMES))
    implementation(project(Modules.CORE_ABSTRACTION))

    implementation(Libs.DaggerHilt.DAGGER_HILT_ANDROID)
    kapt(Libs.DaggerHilt.DAGGER_HILT_COMPILER)
}

// Allow references to generated code
kapt {
    correctErrorTypes = true
}
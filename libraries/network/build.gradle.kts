
plugins {
    id("common-kotlin-plugin")
    id("dagger.hilt.android.plugin")
}

dependencies {

    implementation(project(Modules.CORE_CONFIGURATION))

    apiNetwork()

    implementation(Libs.DaggerHilt.DAGGER_HILT_ANDROID)
    kapt(Libs.DaggerHilt.DAGGER_HILT_COMPILER)
}

// Allow references to generated code
kapt {
    correctErrorTypes = true
}
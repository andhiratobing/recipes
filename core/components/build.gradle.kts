plugins {
    id("common-compose-plugin")
}

dependencies {

    implementation(project(Modules.CORE_THEMES))
    implementation(project(Modules.CORE_ABSTRACTION))

    implementation(Libs.Compose.COMPOSE_LOTTIE)

    implementationComposeUi()

    testImplementation()

    androidTestImplementation()
}
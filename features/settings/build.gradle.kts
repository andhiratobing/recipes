plugins {
    id("common-compose-plugin")
}

dependencies {

    implementation(project(Modules.CORE_NAVIGATION))
    implementation(project(Modules.CORE_COMPONENTS))
    implementation(project(Modules.CORE_THEMES))
    implementation(project(Modules.CORE_ABSTRACTION))

}
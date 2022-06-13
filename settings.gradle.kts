pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Recipes"

// Core
include(":app")
include(":core:components")
include(":core:themes")
include(":core:navigation")
include(":core:abstraction")
include(":core:configuration")

// Libraries
include(":libraries:database")
include(":libraries:network")
include(":libraries:preference")

// Feature
include(":features:splash")
include(":features:recipes")
include(":features:on-boarding")
include(":features:home")
include(":features:favorite")
include(":features:settings")
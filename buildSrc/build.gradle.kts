plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
    kotlin("jvm") version "1.6.21"
}
sourceSets {
    main {
        java.srcDirs(listOf("src/main/java"))
    }
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    // in order to be able to use "kotlin-android" in the common script
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")

    // in order to recognize the "plugins" block in the common script
    implementation("com.android.tools.build:gradle:7.2.1")

    // in order to recognize the "android" block in the common script
    implementation("com.android.tools.build:gradle-api:7.2.1")

    implementation("com.google.dagger:hilt-android-gradle-plugin:2.42")
}
plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    compileSdk = AppConfigs.COMPILE_SDK

    defaultConfig {
        minSdk = AppConfigs.MIN_SDK
        targetSdk = AppConfigs.TARGET_SDK
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = AppConfigs.JVM_TARGET
    }
}
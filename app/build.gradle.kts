plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = 32

    defaultConfig {
        applicationId = "com.art.android.recipes"
        minSdk = 21
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.COMPOSE_VERSION
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    // Core
    implementation(project(Modules.CORE_THEMES))

    // Feature
    implementation(project(Modules.FEATURE_SPLASH))
    implementation(project(Modules.FEATURE_ON_BOARDING))
    implementation(project(Modules.FEATURE_HOME))
    implementation(project(Modules.FEATURE_FAVORITE))
    implementation(project(Modules.FEATURE_SETTINGS))
    implementation(project(Modules.FEATURE_RECIPES))

    implementationAndroidCore()

    implementationComposeUi()

    implementation(Libs.DaggerHilt.DAGGER_HILT_ANDROID)
    kapt(Libs.DaggerHilt.DAGGER_HILT_COMPILER)

    testImplementation()

    androidTestImplementation()
}

// Allow references to generated code
kapt {
    correctErrorTypes = true
}
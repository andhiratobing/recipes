plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = AppConfigs.COMPILE_SDK

    defaultConfig {
        applicationId = AppConfigs.APPLICATION_ID_APP
        minSdk = AppConfigs.MIN_SDK
        targetSdk = AppConfigs.TARGET_SDK
        versionCode = AppConfigs.VERSION_CODE
        versionName = AppConfigs.VERSION_NAME

        testInstrumentationRunner = AppConfigs.TEST_INSTRUMENTATION_RUNNER
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
    implementation(project(Modules.CORE_NAVIGATION))
    implementation(project(Modules.CORE_COMPONENTS))

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
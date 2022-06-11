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
        kotlinCompilerExtensionVersion = "1.1.1"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    // Allow references to generated code
    kapt {
        correctErrorTypes = true
    }
}

dependencies {

    // Android core
    implementation("androidx.core:core-ktx:1.8.0")

    // Compose ui
    implementation("androidx.compose.ui:ui:1.1.1")
    implementation("androidx.compose.material3:material3:1.0.0-alpha13")
    implementation("androidx.compose.foundation:foundation:1.1.1")
    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")
    implementation("androidx.activity:activity-compose:1.4.0")
    implementation("androidx.compose.ui:ui-tooling-preview:1.1.1")

    // Compose navigation
    implementation("androidx.navigation:navigation-runtime-ktx:2.4.2")
    implementation("androidx.navigation:navigation-compose:2.4.2")

    // Dagger hilt
    implementation("androidx.hilt:hilt-navigation-compose:1.0.0")
    implementation("com.google.dagger:hilt-android:2.42")
    kapt("com.google.dagger:hilt-android-compiler:2.42")

    // Kotlin coroutine
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.1")

    // Lifecycle runtime
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.4.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.4.1")

    // Lottie animation
    implementation("com.airbnb.android:lottie-compose:4.2.2")

    // Google accompanist
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.23.1")

    // Room
    implementation("androidx.room:room-runtime:2.4.2")
    kapt("androidx.room:room-compiler:2.4.2")


    // Unit test
    testImplementation("junit:junit:4.13.2")

    // Instrumentation test
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.1.1")

    // Debug
    debugImplementation("androidx.compose.ui:ui-tooling:1.1.1")
    debugImplementation("androidx.compose.ui:ui-test-manifest:1.1.1")
}
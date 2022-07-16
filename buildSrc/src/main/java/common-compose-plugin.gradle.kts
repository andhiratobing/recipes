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

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Versions.COMPOSE_COMPILER_VERSION
    }

    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementationAndroidCore()
    implementationComposeUi()
    debugImplementation(Libs.Compose.COMPOSE_UI_TOOLING)
    debugApi(Libs.Android.CUSTOM_VIEW)
    debugApi(Libs.Android.CUSTOM_VIEW_POOLING_CONTAINER)
    testImplementation()
    testImplementation(Tests.KOTLIN_JUNIT5_TEST)
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("junit:junit:4.13.2")
    testImplementation("androidx.test:core-ktx:1.4.0")
    implementation(Tests.COROUTINE_TEST)
    androidTestImplementation()
}
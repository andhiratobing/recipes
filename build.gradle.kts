buildscript {

    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.42")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.0")
    }

}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
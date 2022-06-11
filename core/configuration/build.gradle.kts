import java.io.FileInputStream
import java.util.*

plugins {
    id("common-kotlin-plugin")
}

android {
    buildTypes {
        debug {
            val properties = Properties().apply {
                load(FileInputStream(file(path = "develop.properties")))
            }

            buildConfigField(
                type = "String",
                name = "BASE_URL",
                value = properties.getProperty("BASE_URL")
            )

            buildConfigField(
                type = "String",
                name = "API_KEY",
                value = properties.getProperty("API_KEY")
            )
        }
    }
}

dependencies {

    testImplementation()

    androidTestImplementation()
}
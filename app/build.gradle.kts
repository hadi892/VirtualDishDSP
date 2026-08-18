plugins {
    id("com.android.application") version "9.1.1"
}

android {
    namespace = "com.virtualdishdsp"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.virtualdishdsp"
        minSdk = 26
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
}

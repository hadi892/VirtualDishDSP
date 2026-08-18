plugins {
    id("com.android.application") version "9.0.0"
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
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
}

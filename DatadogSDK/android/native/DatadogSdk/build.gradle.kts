plugins {
    id("com.android.library")
}

android {
    namespace = "com.microsoft.datadogsdk"
    compileSdk = 35

    defaultConfig {
        minSdk = 21
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("com.datadoghq:dd-sdk-android-core:2.18.0")
    implementation("com.datadoghq:dd-sdk-android-logs:2.18.0")
    implementation("com.datadoghq:dd-sdk-android-rum:2.18.0")
    implementation("com.datadoghq:dd-sdk-android-ndk:2.18.0")
}


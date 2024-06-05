plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.compose.compiler)
}

android {
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ewomer.diceroller"
        minSdk  = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        compose = true
    }

    buildTypes {
        getByName("release") {
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
   
    namespace = "com.ewomer.diceroller"
    buildToolsVersion = "34.0.0"
}

dependencies {

    implementation (libs.androidx.core.ktx)
    implementation (libs.androidx.appcompat)
    implementation (libs.google.android.material)
    implementation (libs.androidx.constraintlayout)

    implementation (libs.androidx.compose.ui.tooling)
    implementation (libs.androidx.compose.ui.tooling.preview)
    implementation (libs.androidx.compose.material)
    implementation (libs.androidx.activity)

    // testImplementation "junit:junit:4.+"
    // androidTestImplementation "androidx.test.ext:junit:1.1.2"
    // androidTestImplementation "androidx.test.espresso:espresso-core:3.3.0"
}

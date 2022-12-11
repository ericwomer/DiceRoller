plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = 33

    defaultConfig {
        applicationId = "com.ewomer.diceroller"
        minSdk  = 22
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        viewBinding = true
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.1"
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
}

dependencies {

    implementation ("androidx.core:core-ktx:1.8.0")
    implementation ("androidx.appcompat:appcompat:1.4.1")
    implementation ("com.google.android.material:material:1.6.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.3")
    
    implementation ("androidx.compose.compiler:compiler:1.3.0")
    implementation ("androidx.compose.ui:ui-tooling-preview:1.3.1")
    implementation ("androidx.compose.material:material:1.3.1")
    implementation ("androidx.activity:activity-compose:1.6.1")
    // testImplementation "junit:junit:4.+"
    // androidTestImplementation "androidx.test.ext:junit:1.1.2"
    // androidTestImplementation "androidx.test.espresso:espresso-core:3.3.0"
}
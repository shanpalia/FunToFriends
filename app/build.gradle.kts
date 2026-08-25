plugins {
    id("com.android.application")
}

android {
    namespace = "in.callbomberz.safe"
    compileSdk = 35

    defaultConfig {
        applicationId = "in.callbomberz.safe"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
        }
        release {
            isMinifyEnabled = false
        }
    }
}

dependencies {
}

plugins {
    id("com.android.library")

}

android {
    namespace = "com.safetyprotection"
    compileSdk = 34

    defaultConfig {
        minSdk = 28
        targetSdk = 34

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    // firebase
    api(platform("com.google.firebase:firebase-bom:32.7.0"))
    api("com.google.firebase:firebase-analytics")
    // appsflyer
    api("com.appsflyer:af-android-sdk:6.12.5")
    // Google Location Services
    api("com.google.android.gms:play-services-location:21.0.1")
    api ("pub.devrel:easypermissions:3.0.0")
    // 网络
    api ("com.squareup.okhttp3:okhttp:4.12.0")
    api ("dnsjava:dnsjava:3.4.2")


}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://plugins.gradle.org/m2/")
    }
    dependencies {
        val kotlinVersion = "1.5.21"
        classpath("com.android.tools.build:gradle:4.2.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.37")
        classpath("org.jlleitschuh.gradle:ktlint-gradle:10.1.0")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.3.5")
    }
}

apply(plugin = "org.jlleitschuh.gradle.ktlint")

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean",  Delete::class)  {
    delete(rootProject.buildDir)
}
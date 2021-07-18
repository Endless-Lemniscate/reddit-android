plugins {
    id ("java-library")
    id ("kotlin")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies {
    val kotlinVersion = "1.5.21"
    implementation ("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
}
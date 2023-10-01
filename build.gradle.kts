buildscript {
    repositories {
      google()

    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.1.2")

        // Add the following lines for Navigation Safe Args plugin
        val nav_version = "2.5.3"
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
    }
}

allprojects {
    repositories {


    }
}

plugins {
    id("com.android.application") version "8.1.2" apply false

}
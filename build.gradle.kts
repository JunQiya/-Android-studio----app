// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.3" apply false
}
val sourceCompatibility by extra(sourceCompatibility)
val targetCompatibility by extra(targetCompatibility)

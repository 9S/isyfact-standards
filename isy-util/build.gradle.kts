/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("de.bund.bva.isyfact.java-conventions")
}

dependencies {
    implementation(project(":isy-exception-core"))
    implementation("org.springframework:spring-context:5.3.21")
    testImplementation("org.springframework:spring-test:5.3.21")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.8.2")
    compileOnly("com.github.spotbugs:spotbugs-annotations:4.2.1")
}

description = "IsyFact-Utilities"

java {
    withJavadocJar()
}

/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("de.bund.bva.isyfact.java-conventions")
}

dependencies {
    implementation(project(":isy-datetime"))
    implementation(project(":isy-exception-core"))
    implementation(project(":isy-logging"))
    implementation("org.springframework:spring-beans:5.3.21")
    implementation("org.springframework:spring-context:5.3.21")
    implementation("org.springframework:spring-core:5.3.21")
    implementation("org.springframework.boot:spring-boot:2.7.1")
    implementation("org.springframework.boot:spring-boot-autoconfigure:2.7.1")
    implementation("org.springframework.boot:spring-boot-configuration-processor:2.7.1")
    implementation("jakarta.validation:jakarta.validation-api:2.0.2")
    testImplementation("org.springframework:spring-test:5.3.21")
    testImplementation("org.springframework.boot:spring-boot-test:2.7.1")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.8.2")
    testImplementation("org.hibernate.validator:hibernate-validator:6.2.3.Final")
}

description = "IsyFact Polling"

java {
    withJavadocJar()
}

tasks.test {
    jvmArgs("-Dcom.sun.management.jmxremote",
            "-Dcom.sun.management.jmxremote.port=9010",
            "-Dcom.sun.management.jmxremote.local.only=false",
            "-Dcom.sun.management.jmxremote.authenticate=false",
            "-Dcom.sun.management.jmxremote.ssl=false",
            "-Dfile.encoding=UTF-8")
}
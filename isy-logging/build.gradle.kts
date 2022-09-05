/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("de.bund.bva.isyfact.java-conventions")
}

dependencies {
    implementation(project(":isy-exception-core"))
    implementation("org.springframework:spring-beans:5.3.21")
    implementation("org.springframework:spring-context:5.3.21")
    implementation("org.springframework.boot:spring-boot:2.7.1")
    implementation("org.springframework.boot:spring-boot-autoconfigure:2.7.1")
    implementation("org.springframework.boot:spring-boot-configuration-processor:2.7.1")
    implementation("ch.qos.logback:logback-classic:1.2.8")
    implementation("ch.qos.logback.contrib:logback-json-classic:0.1.5")
    implementation("ch.qos.logback.contrib:logback-jackson:0.1.5")
    implementation("ch.qos.logback:logback-core:1.2.8")
    implementation("org.slf4j:slf4j-api:1.7.36")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.13.3")
    implementation("org.aspectj:aspectjweaver:1.9.7")
    implementation("javax.validation:validation-api:2.0.1.Final")
    testImplementation("org.hibernate.validator:hibernate-validator:6.2.3.Final")
    testImplementation("org.mockito:mockito-core:4.5.1")
    testImplementation("org.assertj:assertj-core:3.22.0")
    testImplementation("org.springframework:spring-test:5.3.21")
    testImplementation("org.springframework.boot:spring-boot-test:2.7.1")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.8.2")
}

description = "IsyFact-Logging"

java {
    withJavadocJar()
}

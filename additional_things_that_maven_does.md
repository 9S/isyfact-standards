# Plugins

## Reactor POM

* Resource plugin
  * Set Project Encoding to UTF-8
* Compiler Plugin
  * Set Source Encoding to UTF-8
  * Set Source and Target to Java 8
* Javadoc Plugin
  * Generate JAR file
  * Set Encoding to UTF-8
  * Turn off doclint
* Jar Plugin
  * Add Default Implementation Entries to Manifest
* Source Plugin
  * Generate JAR file
* Versions Plugin
* WAR Plugin
* Dependency Plugin
* Install Plugin
* Deploy Plugin
* Clean Plugin
* Antrun Plugin
* Javancss Maven Plugin
* Site Plugin

### Quality Gates 1:

* Tidy Maven Plugin
  * Check POM style
* Enforcer Plugin
  * Verify Java Version 11
  * Verify Maven Version > 3.1.1
  * [Fail on dependency version convergance](https://docs.gradle.org/current/dsl/org.gradle.api.artifacts.ResolutionStrategy.html)
  * Exclude failed dependencies
* ~~Checkstyle Plugin~~ (Excluded for missing dependency)
* Spotbugs Maven Plugin
  * check with maximum effort and output XML
* Surefire Plugin
  * Set args for Tests
  * Set user language and country parameters
* Jacoco Maven Plugin
  * Create Report
* Flatten Maven Plugin
  * Flatten and Clean Maven Structure

## Isy-Polling

* Surefire Plugin
  * Enable JMX with jvmArgs for test execution

## Isy-Task

* Compiler Plugin
  * Set JVM Arg `-parameters` during compilation

## Isy-Standards Doc

* Jar Plugin
  * Disable Jar creation
* Asciidoctor Maven Plugin
  * Compile Asciidoc files
* Assembly Plugin
  * Package everything neatly
* Antrun Plugin
  * Copy images and generated to docs
* Tidy Plugin
  * Check POM

## Plugin Management

* Spring Boot Maven Plugin
  * Emit build info
* Git Commit ID Plugin
  * Include Git Commit in `git.properties`

# Profiles:

* copyReleaseConfiguration
  * Copies Release Configuration from config/release to config/
* release
  * Enforce no SNAPSHOT Versions are allowed
* copyLicenseFiles
  * Copies Licenses to Apidocs
* centralRelease
  * Upload to https://oss.sonatype.org
* JARsigning
  * Signs and Verifies the JAR
* GPGsigning
  * Signs with GPG
* centralmavenrepo
  * sets repositories to oss.sonatype.org
* internalmavenrepo
  * sets repositories to something read from variables
* JDK-11-for-8
  * activates on Java 11 if property for11 is not set
  * configures Javadoc plugin for Java 8
* JDK-11-for-11
  * activates on Java 11 if property for11 is set
  * configures Javadoc plugin for Java 11

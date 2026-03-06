plugins {
    //id("se.patrikerdes.use-latest-versions") version "0.2.19"
    //id("com.github.ben-manes.versions") version "0.41.0"
    application
    checkstyle
    id("org.sonarqube") version "7.2.2.6593"
}
sonar {
    properties {
        property("sonar.projectKey", "Constantine72_qa-auto-engineer-java-project-61")
        property("sonar.organization", "constantine72")
    }

}

application {
    mainClass.set("hexlet.code.App")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.2")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
//java {
//   toolchain {
//       languageVersion.set(JavaLanguageVersion.of(17))
// }
//}

//tasks.getByName("run", JavaExec::class) {
//standardInput = System.`in`

// }

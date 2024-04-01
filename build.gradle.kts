plugins {
    id("java")
}

group = "org.launchcode"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation 'junit:junit:4.12'
}

tasks.test {
    useJUnitPlatform()
}



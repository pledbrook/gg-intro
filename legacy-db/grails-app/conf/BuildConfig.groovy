import grails.util.Environment

grails.servlet.version = "2.5" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.source.level = 1.6
grails.project.target.level = 1.6

grails.project.dependency.resolution = {
    inherits "global"
    log "warn"
    checksums true

    repositories {
        inherits true
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenCentral()
        mavenRepo "http://maven.springframework.org/release"
    }
    dependencies {
        compile "org.springframework.integration:spring-integration-core:2.0.5.RELEASE"

        if (Environment.current == Environment.PRODUCTION) {
            runtime "mysql:mysql-connector-java:5.1.17"
        }
    }

    plugins {
//        compile ":database-migration:1.0"
        compile ":hibernate:$grailsVersion"
        compile ":jquery:1.6.1.1"
        runtime ":dynamic-controller:0.2.1", ":app-info:0.4.3", ":google-visualization:0.4.2"

        build ":tomcat:$grailsVersion"
    }
}

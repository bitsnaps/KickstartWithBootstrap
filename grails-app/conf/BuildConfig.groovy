grails.project.class.dir		= "target/classes"
grails.project.test.class.dir	= "target/test-classes"
grails.project.test.reports.dir	= "target/test-reports"

grails.project.dependency.resolution = {

	inherits	'global'
	log			'warn'

	repositories {
		grailsCentral()
		mavenLocal()
		mavenCentral()
	}

	dependencies {
	}

	plugins {
        build(	":release:3.0.1",
              	":rest-client-builder:1.0.3") {
            export = false
        }
		compile ":scaffolding:2.1.2"									// Needed since Grails 2.3 (upgraded 2.0.1 -> 2.1.2)

		runtime	":resources:1.2.8"										// Needed for Bootstrap's less files (upgraded from 1.2.1 to 1.2.8)
		compile	":lesscss-resources:1.3.3"								// Needed for Bootstrap's less files
	}
}

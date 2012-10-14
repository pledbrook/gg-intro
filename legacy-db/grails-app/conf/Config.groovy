// locations to search for config files that get merged into the main config
// config files can either be Java properties files or ConfigSlurper scripts

// grails.config.locations = [ "classpath:${appName}-config.properties",
//                             "classpath:${appName}-config.groovy",
//                             "file:${userHome}/.grails/${appName}-config.properties",
//                             "file:${userHome}/.grails/${appName}-config.groovy"]

// if(System.properties["${appName}.config.location"]) {
//    grails.config.locations << "file:" + System.properties["${appName}.config.location"]
// }
grails.mime.file.extensions = true // enables the parsing of file extensions from URLs into the request format
grails.mime.types = [ html: ['text/html','application/xhtml+xml'],
                      xml: ['text/xml', 'application/xml'],
                      text: 'text-plain',
                      js: 'text/javascript',
                      rss: 'application/rss+xml',
                      atom: 'application/atom+xml',
                      css: 'text/css',
                      csv: 'text/csv',
                      all: '*/*',
                      json: ['application/json','text/json'],
                      form: 'application/x-www-form-urlencoded',
                      multipartForm: 'multipart/form-data'
                    ]
// The default codec used to encode data with ${}
grails.views.default.codec="none" // none, html, base64
grails.views.gsp.encoding="UTF-8"
grails.converters.encoding="UTF-8"

// enabled native2ascii conversion of i18n properties files
grails.enable.native2ascii = true

grails.resources.adhoc.patterns = ['/images/*', '/css/*', '/js/*', '/plugins/*']

// set per-environment serverURL stem for creating absolute links
environments {
    production {
//        grails.serverURL = "http://www.changeme.com"
    }
}

// log4j configuration
log4j = {
    off     'grails.app.service.org.grails.plugin.resource'
    
    warn    'org.codehaus.groovy.grails.web.servlet',
            'org.codehaus.groovy.grails.web.pages', //  GSP
            'org.codehaus.groovy.grails.web.sitemesh', //  layouts
            'org.codehaus.groovy.grails.commons', // core / classloading
            'org.codehaus.groovy.grails.plugins', // plugins
            'org.codehaus.groovy.grails.orm.hibernate', // hibernate integration
            'org.springframework',
            'org.hibernate'
    
    info "org.grails.plugin"
}

grails.plugins.dynamicController.mixins = [
   'com.burtbeckwith.grails.plugins.appinfo.IndexControllerMixin':       'org.example.AdminManageController',
   'com.burtbeckwith.grails.plugins.appinfo.HibernateControllerMixin':   'org.example.AdminManageController',
   'com.burtbeckwith.grails.plugins.appinfo.Log4jControllerMixin' :      'org.example.AdminManageController',
   'com.burtbeckwith.grails.plugins.appinfo.SpringControllerMixin' :     'org.example.AdminManageController',
   'com.burtbeckwith.grails.plugins.appinfo.MemoryControllerMixin' :     'org.example.AdminManageController',
   'com.burtbeckwith.grails.plugins.appinfo.PropertiesControllerMixin' : 'org.example.AdminManageController',
   'com.burtbeckwith.grails.plugins.appinfo.ScopesControllerMixin' :     'org.example.AdminManageController'
]

@GrabResolver(name='grails-core', root='http://repo.grails.org/grails/core')
@Grab(group='org.grails', module='grails-datastore-gorm-mongo', version='1.0.0.RC5')
@Grab(group='org.slf4j', module='slf4j-simple', version='1.6.1')

import grails.persistence.*
import org.grails.datastore.gorm.mongo.config.*

MongoDatastoreConfigurer.configure("myDatabase", Book)

Book.withSession {
    new Book(title:"The Stand").save(flush:true)
    
    Book.list().each {
        println it.title
    }
}


@Entity
class Book {
    String title
}

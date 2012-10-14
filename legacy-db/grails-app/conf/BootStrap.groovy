import com.grailsinaction.legacy.db.*

class BootStrap {

    def init = { servletContext ->
        // Create some test data
        def london = new Location(name: "London").save(failOnError: true)
        def newYork = new Location(name: "New York").save(failOnError: true)
        def chicago = new Location(name: "Chicago").save(failOnError: true)

        def main = new Branch(id: "Main Street").save(failOnError: true)
        def leadenhall = new Branch(id: "Leadenhall Street").save(failOnError: true)
        new Manager(name: "Barry", managementRating: 5, location: chicago, branch: main).save(failOnError: true)
        new Manager(name: "Jill", managementRating: 7, location: london, branch: leadenhall).save(failOnError: true)
    }
} 

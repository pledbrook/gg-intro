package org.example

class Audit {
    String message
    Date dateCreated

    static constraints = {
        message blank: false
    }
}

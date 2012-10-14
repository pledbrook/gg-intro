package org.example

class AuditService {

    void messageReceived(String msg) {
        new Audit(message: msg).save(failOnError: true) 
    }
}

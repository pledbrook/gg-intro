package org.example

class AuditController {
    static scaffold = true

    def senderService

    def test() {}
    def send(String message) {
        senderService.send(message)
        flash.message = message
        redirect action: "test"
    }
}

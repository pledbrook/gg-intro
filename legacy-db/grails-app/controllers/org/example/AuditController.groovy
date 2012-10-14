package org.example

class AuditController {
    static scaffold = true

    def senderService

    def test() {}
    def send() {
        senderService.send(params.message)
        flash.message = params.message
        redirect action: "test"
    }
}

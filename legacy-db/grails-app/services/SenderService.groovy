import org.springframework.integration.message.GenericMessage

class SenderService {
    def mainChannel

    boolean send(String msg) {
//        return mainChannel.send(new GenericMessage<String>(msg))
    }
}

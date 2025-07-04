
@FunctionalInterface
interface MessageService {
    void send(String message);
}
// Main -------------------------
public class Main {

    public static void main(String[] args) {
        // Marketing message--------------------
        String marketingMessage = " Promoção imperdível! Acesse nosso site agora!";

        // Lambda implementation --------------------
        MessageService smsService = message -> System.out.println("[SMS] " + message);
        MessageService emailService = message -> System.out.println("[Email] " + message);
        MessageService socialMediaService = message -> System.out.println("[Redes Sociais] " + message);
        MessageService whatsappService = message -> System.out.println("[WhatsApp] " + message);

        // Sending through all services
        sendMessage(marketingMessage, smsService);
        sendMessage(marketingMessage, emailService);
        sendMessage(marketingMessage, socialMediaService);
        sendMessage(marketingMessage, whatsappService);
    }

    // Method using interface
    public static void sendMessage(String message, MessageService service) {
        service.send(message);
    }
}
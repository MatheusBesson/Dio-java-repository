
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // count number
        int number = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite o número da conta:"));

        // agency
        String agency = JOptionPane.showInputDialog("Por favor, digite o número da agência:");

        String clientName = JOptionPane.showInputDialog("Digite seu nome: ");

        // random balance account 0 to 1000
        Random random = new Random();
        float balance = ThreadLocalRandom.current().nextInt(0, 100_001) / 100.0f;

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo é R$ %s já está disponível para saque.", clientName, agency, number, balance);
    }
}

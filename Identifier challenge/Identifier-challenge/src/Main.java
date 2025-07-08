import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Criando um objeto Scanner para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Lendo a string (nome)
        System.out.println("Digite o nome de Usuário:");
        String nome = scanner.nextLine();

        // Lendo o número inteiro (ID)
        System.out.println("Digite um número pra identificação:");
        int id = scanner.nextInt();


        // TODO: Formate o identificador (minúsculas e sem espaços):
        String identifier = nome + "-" + id;
        String formatado = identifier.replace(" ", "").toLowerCase();


        // TODO: Exiba o resultado:
        System.out.println(formatado);

        // Fechando o scanner
        scanner.close();
    }
}
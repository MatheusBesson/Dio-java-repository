import java.util.Scanner;

public class URL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lendo a entrada do usuário
        System.out.println("Digite a URL abaixo:");
        String url = scanner.nextLine();
        
        // TODO: Normalize a URL: removendo espaços e convertendo para minúsculas
        String urlFormatted = url.trim().toLowerCase();
        
        // TODO: Exiba a URL normalizada
        System.out.println(urlFormatted);
        
        scanner.close();
    }
}
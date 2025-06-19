import Exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            num1 = scanner.nextInt();
            System.out.println("Digite o segundo parâmetro");
            num2 = scanner.nextInt();

            try {
                //chamando o método contendo a lógica de contagem
                contar(num1, num2);
                break;

            } catch (ParametrosInvalidosException exception) {
                //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println(exception.getMessage());
                System.out.println("Tente novamente...");

            }
        }
    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (num2 <= num1) {
            throw new ParametrosInvalidosException("[ERRO] O segundo parâmetro precisa ser maior que o primeiro!");
        }
        int contagem = (num2 - num1) + 1;
        //realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i < contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
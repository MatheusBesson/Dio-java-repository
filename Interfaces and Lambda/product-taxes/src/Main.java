import java.util.HashMap;
import java.util.Map;

@FunctionalInterface
interface TaxCalculator {
    double calculate(double price);
}

public class Main {

    public static void main(String[] args) {
        // product price (example)
        double productPrice = 100.00;

        // Mapeamento de categorias para cálculo de tributo
        Map<String, TaxCalculator> taxStrategies = new HashMap<>();
        taxStrategies.put("Alimentação", price -> price * 0.01);
        taxStrategies.put("Saúde e Bem Estar", price -> price * 0.015);
        taxStrategies.put("Vestuário", price -> price * 0.025);
        taxStrategies.put("Cultura", price -> price * 0.04);

        // Use example:
        printTax("Alimentação", productPrice, taxStrategies);
        printTax("Saúde e Bem Estar", productPrice, taxStrategies);
        printTax("Vestuário", productPrice, taxStrategies);
        printTax("Cultura", productPrice, taxStrategies);
        printTax("Outro", productPrice, taxStrategies); // Tipo inválido
    }

    private static void printTax(String category, double price, Map<String, TaxCalculator> strategies) {
        TaxCalculator calculator = strategies.get(category);
        if (calculator != null) {
            double tax = calculator.calculate(price);
            System.out.printf("Categoria: %s | Preço: R$%.2f | Imposto: R$%.2f%n", category, price, tax);
        } else {
            System.out.printf("Categoria '%s' não encontrada.%n", category);
        }
    }
}
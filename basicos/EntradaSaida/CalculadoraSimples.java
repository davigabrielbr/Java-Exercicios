import java.util.Scanner;
import java.util.Locale;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o primeiro número: ");
        float n1 = scanner.nextFloat();

        System.out.print("Digite o segundo número: ");
        float n2 = scanner.nextFloat();

        float soma = n1 + n2;
        float subtracao = n1 - n2;
        float multiplicacao = n1 * n2;
        float divisao = 0;
        
        if (n2 == 0) {
            System.out.println("Divisor inválido!");
        } else {
            divisao = n1 / n2;
            System.out.printf("Resultado da divisão: %.2f%n", divisao);
        }
        
        System.out.printf("Resultado da soma: %.2f%n", soma);
        System.out.printf("Resultado da subtração: %.2f%n", subtracao);
        System.out.printf("Resultado da multiplicação: %.2f%n", multiplicacao);

        scanner.close();
    }
}
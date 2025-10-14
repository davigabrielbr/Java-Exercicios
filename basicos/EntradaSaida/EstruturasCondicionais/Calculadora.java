import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite a operação: (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);
        
        double resultado;

        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("Resultado da soma: " + resultado);
                break;
            case '-':
                resultado = numero1 - numero2;
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case '*':
                resultado = numero1 * numero2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case '/':
                if (numero2 == 0) {
                    System.out.println("Erro: divisão por zero não é permitida!");
                } else {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado da divisão: " + resultado);
                }
                break;
            default:
                System.out.println("Operador inválido!");
        }

        scanner.close();
    }
}
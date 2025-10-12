import java.util.Scanner;

public class ConversorMetrosParaCentimetros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em metros: ");
        double metros = scanner.nextDouble();

        double conversao = metros * 100;

        System.out.println("Resultado da conversão em centímetros: " + conversao);

        scanner.close();
    }
}
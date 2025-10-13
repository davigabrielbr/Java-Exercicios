package EstruturasCondicionais;

import java.util.Scanner;

public class PositivoNegativoZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        float numero = scanner.nextFloat();

        if (numero == 0) {
            System.out.println("Número zero!");
        } else if (numero < 0) {
            System.out.println("Número negativo!");
        } else {
            System.out.println("Número positivo!");
        }

        scanner.close();
    }
}
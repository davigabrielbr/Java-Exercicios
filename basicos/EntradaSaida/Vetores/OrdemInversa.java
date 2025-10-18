package Vetores;

import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vetor[] = new int[5];

        for (int contador = 0; contador < vetor.length; contador++) {
            System.out.print("Digite o " + (contador + 1) + " valor: ");
            vetor[contador] = scanner.nextInt();
        }

        for (int contador = vetor.length - 1; contador >= 0; contador--) {
            System.out.println(vetor[contador]);
        }

        scanner.close();
    }
}
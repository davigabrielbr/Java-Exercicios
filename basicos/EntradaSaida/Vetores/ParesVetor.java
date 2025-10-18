package Vetores;

import java.util.Scanner;

public class ParesVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vetor[] = new int[5];
        int pares = 0;

        for (int contador = 0; contador < vetor.length; contador++) {
            System.out.print("Digite o " + (contador + 1) + " valor: ");
            vetor[contador] = scanner.nextInt();

            if (vetor[contador] % 2 == 0) {
                pares = pares + 1;
            }
        }

        System.out.println("Valores pares digitado: " + pares);
        
        scanner.close();
    }
}

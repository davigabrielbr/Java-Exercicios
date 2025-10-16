package Vetores;

import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int vetor[] = new int[5];
    int soma = 0;

    for (int contador = 0; contador < vetor.length; contador++) {
        System.out.print("Digite o valor da posição " + contador + " do vetor: ");
        vetor[contador] = scanner.nextInt();
        soma += vetor[contador];
    }

    System.out.println("Soma dos valores digitados: " + soma);

    scanner.close();
    }
}
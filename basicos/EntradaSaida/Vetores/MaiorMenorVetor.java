package Vetores;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MaiorMenorVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        float vetor[] = new float[5];

        for (int contador = 0; contador < vetor.length; contador++) {
            System.out.print("Digite o valor " + (contador + 1) + ": ");
            vetor[contador] = scanner.nextFloat();
        }

        Arrays.sort(vetor);

        float maior = vetor[vetor.length - 1];
        float menor = vetor[0];

        System.out.println("Maior valor digitado: " + maior);
        System.out.println("Menor valor digitado: " + menor);

        scanner.close();
    }
}